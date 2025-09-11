using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using PROG7314_POE.Services;

namespace PROG7314_POE.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class CameraController : ControllerBase
    {
        ////GET /video-feed → StreamLiveFeed()
        //[HttpGet("VideoFeed")]
        ////GET /map → GetMapData()
        //[HttpGet("GetMapData")]

        private readonly CameraService _cameraService;

        public CameraController(CameraService cameraService)
        {
            _cameraService = cameraService;
        }

        [HttpGet("stream")]
        public IActionResult GetCameraFeed()
        {
            var imageBytes = _cameraService.GetLiveFeed();
            return File(imageBytes, "image/jpeg");
        }
    }
}
