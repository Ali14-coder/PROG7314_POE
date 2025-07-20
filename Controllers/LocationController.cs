using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using PROG7314_POE.Models;

namespace PROG7314_POE.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class LocationController : ControllerBase
    {
        //POST /location → SetReturnLocation(Location location)
        [HttpPost("Location")]
        //GET /location → GetCurrentLocation()
        [HttpGet("Location")]
    }
}
