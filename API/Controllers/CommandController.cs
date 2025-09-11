using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using PROG7314_POE.Services;

namespace PROG7314_POE.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class CommandController : ControllerBase
    {
        ////POST /command → ExecuteCommand(Command command)
        //[HttpPost("ExecuteCommand")]
        ////GET /status → GetStatus()
        //[HttpGet("GetStatus")]
            
        private readonly NavigationService _navigationService;
        private readonly GeminiService _geminiService;

            public CommandController(NavigationService navigationService, GeminiService geminiService)
            {
                _navigationService = navigationService;
                _geminiService = geminiService;
            }

            [HttpPost("navigate")]
            public IActionResult Navigate([FromBody] string command)
            {
                var result = _navigationService.ProcessCommand(command);
                return Ok(result);
            }

            [HttpPost("ask-gemini")]
            public async Task<IActionResult> AskGemini([FromBody] string question)
            {
                var response = await _geminiService.AskQuestionAsync(question);
                return Ok(response);
            }
    }

    
}
