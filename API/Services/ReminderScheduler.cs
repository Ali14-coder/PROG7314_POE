namespace PROG7314_POE.Services
{
    public class ReminderScheduler
    {
        private readonly List<Reminder> _reminders = new();

        public void AddReminder(Reminder reminder)
        {
            _reminders.Add(reminder);
        }

        public List<Reminder> GetReminders()
        {
            return _reminders.OrderBy(r => r.Time).ToList();
        }

        public void RemoveReminder(string id)
        {
            var reminder = _reminders.FirstOrDefault(r => r.Id == id);
            if (reminder != null)
            {
                _reminders.Remove(reminder);
            }
        }

        public record Reminder(string Id, string Task, DateTime Time);
    }
}
