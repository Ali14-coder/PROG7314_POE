namespace PROG7314_POE.Services
{
    public class GeminiService
    {
        private readonly HttpClient _httpClient;
        private readonly string _apiKey;

        public GeminiService(HttpClient httpClient, IConfiguration config)
        {
            _httpClient = httpClient;
            _apiKey = config["GeminiApiKey"];
        }

        public async Task<string> AskGeminiAsync(string question)
        {
            var request = new
            {
                question = question
            };

            var response = await _httpClient.PostAsJsonAsync($"https://gemini.googleapis.com/v1/ask?key={_apiKey}", request);
            response.EnsureSuccessStatusCode();
            var result = await response.Content.ReadFromJsonAsync<GeminiResponse>();
            return result.Answer;
        }

        public class GeminiResponse
        {
            public string Answer { get; set; }
        }
    }
}
