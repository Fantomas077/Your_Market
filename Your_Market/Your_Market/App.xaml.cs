using System;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;
using Your_Market.Views;

namespace Your_Market
{
    public partial class App : Application
    {
        public App()
        {
            InitializeComponent();

            var navigationPage= new NavigationPage(new Home());

            navigationPage.BarBackgroundColor = Color.FromHex("#E2AA18");
            MainPage = navigationPage;
        }

        protected override void OnStart()
        {
        }

        protected override void OnSleep()
        {
        }

        protected override void OnResume()
        {
        }
    }
}
