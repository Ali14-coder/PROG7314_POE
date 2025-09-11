using PROG7314_POE.Models;

namespace PROG7314_POE.Services
{
    public class NavigationService
    {
        private Location _homeLocation;
        private Location _currentLocation;

        public void SetHomeLocation(Location location)
        {
            _homeLocation = location;
        }

        public Location GetCurrentLocation()
        {
            return _currentLocation;
        }

        public void UpdateCurrentLocation(float x, float y)
        {
            _currentLocation = new Location { X = x, Y = y };
        }

        public string GetPathToHome()
        {
            // Simplified example
            return $"Navigating from ({_currentLocation.X},{_currentLocation.Y}) to ({_homeLocation.X},{_homeLocation.Y})";
        }

    }
}
