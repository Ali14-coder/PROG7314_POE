using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace PROG7314_POE.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ReminderController : ControllerBase
    {
        //POST /reminder → AddReminder(Reminder reminder)
        [HttpPost("AddReminder")]
        //GET /reminders → GetAllReminders()
        [HttpGet("GetAllReminders")]
        //DELETE /reminder/{id} → DeleteReminder(string id)
        [HttpDelete("DeletedReminder/{ReminderID}")]
    }
}
