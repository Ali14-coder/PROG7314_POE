using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace PROG7314_POE.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class CommandController : ControllerBase
    {
        //POST /command → ExecuteCommand(Command command)
        [HttpPost("ExecuteCommand")]
        //GET /status → GetStatus()
        [HttpGet("GetStatus")]

    }
}
