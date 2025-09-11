namespace PROG7314_POE.Services
{
    public class CameraService
    {
        public async Task<byte[]> CaptureImageAsync()
        {
            // Simulate reading from a USB camera
            return await File.ReadAllBytesAsync("path/to/sample.jpg");
        }

        public string ConvertToBase64(byte[] imageData)
        {
            return Convert.ToBase64String(imageData);
        }
    }
}
