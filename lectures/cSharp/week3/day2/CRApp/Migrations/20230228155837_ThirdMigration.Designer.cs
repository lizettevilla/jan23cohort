﻿// <auto-generated />
using System;
using CRApp.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Migrations;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;

#nullable disable

namespace CRApp.Migrations
{
    [DbContext(typeof(MyContext))]
    [Migration("20230228155837_ThirdMigration")]
    partial class ThirdMigration
    {
        protected override void BuildTargetModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("ProductVersion", "6.0.3")
                .HasAnnotation("Relational:MaxIdentifierLength", 64);

            modelBuilder.Entity("CRApp.Models.Squishy", b =>
                {
                    b.Property<int>("SquishyId")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int");

                    b.Property<DateTime>("CreatedAt")
                        .HasColumnType("datetime(6)");

                    b.Property<string>("Owner")
                        .IsRequired()
                        .HasColumnType("longtext");

                    b.Property<string>("SquishyImg")
                        .IsRequired()
                        .HasColumnType("longtext");

                    b.Property<string>("SquishyName")
                        .IsRequired()
                        .HasColumnType("longtext");

                    b.Property<DateTime>("UpdatedAt")
                        .HasColumnType("datetime(6)");

                    b.HasKey("SquishyId");

                    b.ToTable("Squishys");
                });

            modelBuilder.Entity("CRApp.Models.Tune", b =>
                {
                    b.Property<int>("TuneId")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int");

                    b.Property<DateTime>("CreatedAt")
                        .HasColumnType("datetime(6)");

                    b.Property<string>("Owner")
                        .IsRequired()
                        .HasColumnType("longtext");

                    b.Property<string>("TuneImg")
                        .IsRequired()
                        .HasColumnType("longtext");

                    b.Property<string>("TuneName")
                        .IsRequired()
                        .HasColumnType("longtext");

                    b.Property<DateTime>("UpdatedAt")
                        .HasColumnType("datetime(6)");

                    b.HasKey("TuneId");

                    b.ToTable("Tunes");
                });
#pragma warning restore 612, 618
        }
    }
}
