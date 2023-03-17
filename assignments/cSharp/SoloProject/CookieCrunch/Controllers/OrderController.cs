using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using CookieCrunch.Models;
using Microsoft.AspNetCore.Mvc.Filters;
using Microsoft.EntityFrameworkCore;

namespace CookieCrunch.Controllers;

public class OrderController : Controller 
{

    private MyContext db;
    
    public OrderController(MyContext context)
    {
        db = context;
    }
    private int? uid {
        get {
            return HttpContext.Session.GetInt32("uid");
        }
    }
[SessionCheck]
[HttpGet("/order/dashboard")] 
public IActionResult Dashboard() {
    List<Order> allOrders = db.Orders
    .Include(o => o.Author)
    .ToList();
    return View("dashboard", allOrders);
    }
    [SessionCheck]
    [HttpGet("/order/{orderId}/view")]
    public IActionResult ViewOrder(int orderId) {
        Order? item = db.Orders.Include(item => item.Author)
        .FirstOrDefault(item => item.OrderId == orderId);
        if(item == null){
            return RedirectToAction("dashboard");
        }else{
            return View("ViewOrder", item);
        }
     }
[SessionCheck]
[HttpGet("/order/addOrder")]
    public IActionResult AddOrder() {
        return View("addOrder");
        
    }
[HttpPost("/order/createOrder")]
    public IActionResult CreateOrder(Order o) {
        o.UserId = (int)uid;
        if(ModelState.IsValid) {
            db.Orders.Add(o);
            db.SaveChanges();
            return Redirect("dashboard");
        }
        return View("addOrder");
    }
    [SessionCheck]
    [HttpGet("/order/{orderId}/edit")]
    public IActionResult EditOrder(int orderId) {
        Order? item = db.Orders.Include(item => item.Author)
        .FirstOrDefault(item => item.OrderId == orderId);
        if(item == null){
            return RedirectToAction("dashboard");
        }else{
            return View("EditOrder", item);
        }
    }
    [HttpPost("/order/{orderId}/updateOrder")]
    public IActionResult UpdateOrder(Order o, int orderId) {
        Console.WriteLine(orderId);
        Console.WriteLine(o);
        Console.WriteLine(o.CookieName);
        if(ModelState.IsValid){
        Order? item = db.Orders
        .FirstOrDefault(i => i.OrderId == orderId);
         if(item == null){
            return RedirectToAction("dashboard");
            }else{
                item.CookieName = o.CookieName;
                item.Description = o.Description;
                db.Orders.Update(item);
                db.SaveChanges();
            return RedirectToAction("Dashboard");
            }
        }else{
            Console.WriteLine("Error==================");
            return View("EditOrder", orderId);
        }
    }
    [HttpGet("/order/{orderId}/delete")]
    public IActionResult DeleteOrder(int orderId) {
        Order? item = db.Orders.FirstOrDefault(item => item.OrderId == orderId);
        if(item != null) {
            db.Orders.Remove(item);
            db.SaveChanges();
        }
        return RedirectToAction("Dashboard");
    }
}
