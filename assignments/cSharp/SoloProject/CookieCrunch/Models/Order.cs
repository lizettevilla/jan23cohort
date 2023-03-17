#pragma warning disable CS8618
using System.ComponentModel.DataAnnotations;
namespace CookieCrunch.Models;

public class Order {
    [Key]
    public int OrderId {get; set;}
    [Required]
    [MinLength(3, ErrorMessage ="Cookie Name must be at least 3 characters long")]
    public string CookieName {get;set;}
    
    [Required]
    [MinLength(3, ErrorMessage ="Cookie Name must be at least 3 characters long")]
    public string Description {get;set;}

    public int Quantity {get;set;}

    [Display(Name = "Image URL")]
    public string ImgUrl { get; set; }


    public DateTime CreatedAt { get; set; } = DateTime.Now;
    public DateTime UpdatedAt { get; set; } = DateTime.Now;

     public int UserId {get; set;}
    public User? Author {get; set;} 
}