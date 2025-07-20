namespace PROG7314_POE.Models
{
    public class RobotStatus
    {
        public string RobtotStatus { get; set; } // e.g. "idle", "executing", etc.
        public string RobotCurrentLocation { get; set; }
        public string RobotCurrentTask { get; set; }
    }
}
