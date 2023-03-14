﻿using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using CRApp.Models;

namespace CRApp.Controllers;

public class HomeController : Controller
{
    private readonly ILogger<HomeController> _logger;

    // private MyContext _context;

    private MyContext db;

    public HomeController(ILogger<HomeController> logger, MyContext context)
    {
        _logger = logger;
        db = context;
    }

    public IActionResult Index()
    {
        return View();
    }

    public IActionResult Privacy()
    {
        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}
