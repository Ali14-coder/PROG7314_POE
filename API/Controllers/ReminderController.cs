using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using PROG7314_POE.Models;
using PROG7314_POE.Services;

namespace PROG7314_POE.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ReminderController : ControllerBase
    {
        ////POST /reminder → AddReminder(Reminder reminder)
        //[HttpPost("AddReminder")]
        ////GET /reminders → GetAllReminders()
        //[HttpGet("GetAllReminders")]
        ////DELETE /reminder/{id} → DeleteReminder(string id)
        //[HttpDelete("DeletedReminder/{ReminderID}")]
        private readonly ReminderScheduler _reminderScheduler;

        public ReminderController(ReminderScheduler reminderScheduler)
        {
            _reminderScheduler = reminderScheduler;
        }

        [HttpPost("add")]
        public IActionResult AddReminder([FromBody] Reminder reminder)
        {
            _reminderScheduler.AddReminder(reminder);
            return Ok("Reminder added.");
        }

        [HttpGet("all")]
        public IActionResult GetReminders()
        {
            return Ok(_reminderScheduler.GetAllReminders());
        }

    }
}
