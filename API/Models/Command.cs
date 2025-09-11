namespace PROG7314_POE.Models
{
    public class Command
    {
        public string TextCommand { get; set; }
        public string VoiceCommand { get; set; }
        public DateTime CommandTimestamp { get; set; }
        public string CommandStatus { get; set; } // e.g., "On my way to object", "Object found", "Fetching object", "Coming to you"
        public string CommandTaskId { get; set; }
    }
}
