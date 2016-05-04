package com.atnt.pages;


/**
 * @author prashant_kumar
 *
 * This class contains all xpaths
 */
public class Elements {
	
	// Global Navbar Header -
	// top  links
	public static final String globalNavAllLinks = "//div[@id='ge5p_z1-global-nav-container']/ul[1]/li[1]/a";
	public static final String secondaryNavAllLinks = "//div[@id='ge5p_z2-user-info']/div/div/span";
	public static final String secondaryNavLogonButton = "//div[@id='ge5p_z2-user-info']/div/a/span";
	public static final String primaryNavAllLinksAndSearchBox = "//div[@id='ge5p_z2-primary-nav-wrapper']/nav/ul/li";
	
	
	public static final String globalNavPeronalLink="//*[@id='ge5p_z1_s1001']";
		// SubLinks - //*[@id='ge5p_z1_t1001'] ...
	public static final String globalNavBusinessLink="//*[@id='ge5p_z1_s1002']";
		// SubLinks -//*[@id='ge5p_z1_t1005'] ...
	public static final String globalNavAboutAtntLink="//*[@id='ge5p_z1_s1003']";
		// SubLinks - //*[@id='ge5p_z1_t1009'] ...
	// Secondary Navbar, user info, Login, Register
	public static final String secondaryNavZipLink="//*[@id='ge5p_z2-zipcode-enter']";
	public static final String secondaryNavRegisterLink="//*[@id='ge5p_z2-zipcode-register']";
	public static final String secondaryNavLoginButton="//*[@id='ge5p_z2-user-auth']/span";
	// Primary Navigational Bar
	// Shop | myAT&T | Support
	public static final String primaryNavHomeLogoLink="//*[@id='primaryLogo']/a";
	public static final String primaryNavShopLink="//*[@id='ge5p_z2_p1001']";
		public static final String primaryNavShopWirelessLink="//*[@id='ge5p_z2_s1001']";
			public static final String primaryNavShopWirelessSmartPhone="//*[@id='ge5p_z2_t1002']";
			// ge5p_z2_t1002 | ge5p_z2_t1003 | ge5p_z2_t1004 | ge5p_z2_t1005 | ge5p_z2_t1006 ..
			// ge5p_z2_t1007/H3 | ge5p_z2_t1008 | ge5p_z2_t1009 | ge5p_z2_t10010 | ge5p_z2_t10011 | ge5p_z2_t10012 
			//..
			public static final String primaryNavShopTVLink="//*[@id='ge5p_z2_s1002']";
			// //*[@id='ge5p_z2_s1002']
			public static final String primaryNavShopBundlesLink="//*[@id='ge5p_z2_s1003']";
			//*[@id='ge5p_z2_t1053']
			public static final String primaryNavShopInternetLink="//*[@id='ge5p_z2_s1004']";
			//*[@id='ge5p_z2_t1062']
			public static final String primaryNavShopHomePhoneLink="//*[@id='ge5p_z2_s1005']";
			
			public static final String primaryNavShopDigitalLifeLink="//*[@id='ge5p_z2_s1006']";
			public static final String primaryNavShopAccessoriesLink="//*[@id='ge5p_z2_s1007']";
			public static final String primaryNavShopOffersLink="//*[@id='ge5p_z2_s1008']";
	public static final String primaryNavMyATnTLink="//*[@id='ge5p_z2_p2001']";
		public static final String primaryNavMyATnTOverview="//*[@id='ge5p_z2_p3001']";
	
	public static final String primaryNavSupportLink="//*[@id='ge5p_z2_p3001']";
	public static final String primaryNavSearchBox="//*[@id='ge5p_search']]";

	
	
	
	
	
	
	
	//   Other project reff   ////
	
	//Search - Prasanna
	public static final String searchBtn="//span[@id='navSearch']";
	public static final String searchBox="//input[@id='searchInput']";
	public static final String selectText="//div[@class='search-context']//span[contains(text(),'SiriusXM Hits 1')]";
	public static final String searchEnter=".RegularSearch.search-regular-icon";
	public static final String pauseAudio="//div[@title='Pause audio']";
	public static final String channelnum=".//*[@id='nowPlaying']//div[contains(@class,'channel-number')]";
	public static final String onAirChannel=".//span[contains(text(),'Town Hall Series')]/..//img";
	public static final String nowPlayingLogo="//div[@class='now-playing-image']/img[@title='Opens the channel information page']";
	public static final String favoriteBtn="//div[@title='Add this channel to your Favorites']";
	public static final String channelInfo="//div[@class='now-playing-channel-logo']//div[@title='Opens the channel information page']";
	public static final String favorites = "//div[@id='nowPlaying']//div[@class='now-playing-image']/img/../../div[3]";

	// Login Page Objects //

	public static final String userName = "usernameInput";
	public static final String password = "passwordInput";
	public static final String submitBtn = "submitBtn";
	public static final String errorPopup = "//div[@class='login-error']/span[1]";
	public static final String okBtn = "confirm-okay";
	public static final String logincustomeragreement = ".//*[@id='wrapper']//span[contains(text(),'Customer Agreement')]";
	public static final String loginprivacypolicy = ".//*[@id='wrapper']//span[contains(text(),'Privacy')]";
	public static final String loginlocatingyou = ".//*[@id='wrapper']//span[contains(text(),'Locating You')]";
	public static final String loginlocatingyouverify = "//span[contains(text(),'Location Usage Policy')]";
	public static final String loginlocatingyouok = "//*[@class='cofirm-buttons']//div[@class='confirm-okay']";
	public static final String forgotpassword = ".//*[@id='wrapper']//*[@class='forgot-pwd']";
	public static final String forgotpasswordpage = "//div[contains(text(),'Recover Your Credentials')]";
	public static final String getstarted = "startedBtn";
	public static final String getstartedpage = "//div[contains(text(),'Get Started')]";
	
	
	// Home Page Elements
	public static final String favoriteMenu = "//span[text()='Favorites']";
	//public static final String favoriteMenu ="//div[@class='menu']//span[@title='Favorite channels and shows']";
	public static final String SearchLink = "//div[@class='menu']//span[@id='navSearch']";
	public static final String ChannelsLink = "//div[contains(@class,'menu')]//span[@id='navChannel']";
	public static final String MeLink = "//div[contains(@class,'menu')]//span[@title='Settings and more']";
	public static final String recentLink = "//div[contains(@class,'menu')]//span[@id='navrecent']";
	public static final String skipFrwd = "//div[@ng-click='skip()']";
	public static final String skipBkwrd = "//div[@ng-click='rewind()']";
	public static final String pause = "//div[@ng-click='pause()']";
	public static final String playBtn = "//div[@ng-click='play()']";
	public static final String goLiveBtn = "//span[text()='go live']";
	public static final String currentlyLive_popup = "//h2[contains(text(),'currently live')]";
	public static final String progressbar = "//span[contains(@class,'ui-slider-horizontal')]";
	public static final String SliderHandle = "//span[contains(@class,'ui-slider-handle')]";
	public static final String SiriusXmLogo = "//div[@class='now-playing-image']//img";
	public static final String songTitle = "//div[contains(@class,'np-track-artist')]//span[@class='ng-binding']";
	public static final String trackTitle = "//div[contains(@class,'line-track')]//span[1]";
	public static final String goLive = "//div[contains(@class,'go-to-live')]/span[contains(@class,'disp-two')]";
	public static final String Live = "//div[contains(@class,'go-to-live')]/span[1]";
	public static final String back15 = "//div[contains(@ng-class,'disableBack15')]";
	public static final String shareAODfb = "//*[@id='onDemandShareContextView']//div[text()='Share on Facebook']";
	public static final String shareAOD = "//div[contains(@class,'aod-restricted-share')]";
	public static final String  shareAODtweet = "//*[@id='onDemandShareContextView']//div[text()='Share on Twitter']";
	public static final String currentLivePopup ="//div[@class='more-listening-choice ng-scope']//div[@ng-show='popup' and contains(@class,'photo')]";
	public static final String moreLikeThisTxt ="//div[@id='simpleDialog']//div[contains(@class,'more-display-section')]/div[@ng-show='popup']/div[@class='first']/span[text()='More Like This']";
	
	
	public static final String mySXMPDTImage = "//div[contains(@class,'content-type-music-view')]//div[@class='now-playing-channel-logo']//span[contains(@class,'RegularMySXM')]";
	public static final String MyMixlink = "//div[contains(@class,'my-sxm-head')]//span[text()='my mix']";
	public static final String companionContentarea = "//div[contains(@class,'companion-content-animation')]/span";
	public static final String companionContentclose = ".//*[@id='nowPlaying']/div/div[2]/div[1]/div/div[1]/span";
	public static final String restartBtn = " //span[text()='Restart Show']";
	public static final String liveDialogBox = "//div[@class='modal-dialog']//button[@class='close']";
	public static final String Hits1Logo = "//div[@class='now-playing-channel-logo']//div[contains(text(),'02')]/..//img[contains(@src,'siriushits1')]";
	public static final String ListenToLive = "//div[@ng-click='switchToLive()']";
	public static final String MySXM_FavIcon = "//div[@class='now-playing-channel-logo']/div[5]";
	public static final String moreLikethis_Title_MySXM = "//span[contains(@class,'head-title')]";
	public static final String moreLikethis_Title_Live = "//div[contains(@class,'NPL-view')]//div[contains(@class,'mlt-container')]//span[contains(@class,'head-title')]";
	public static final String moreLikethis_Title1 = "//div[contains(@class,'NPL-view more-display-section')]//div[@class='mlt-container']//div[contains(text(),'No Data Available')]";
	public static final String exPloreChannel_Btn = "//div[@class='ws-nav-feature-list']//div[contains(text(),'Explore Channels & Shows')]";
	public static final String WelcomeScreenHeading = "//span[text()='Pick a channel to start listening']";
	public static final String customMixChannel_Heading_welcomeScreen = "//span[text()='Custom Mix a Channel']";
	public static final String favorites_Heading_welcomeScreen = "//div[@class='ws-cd-header']//span[text()='Favorites']";
	public static final String showsNPL = "//div[contains(@class,'show-list-innerHead')]";
	public static final String onAir_Shows_NPL = "//img[@src='assets/images/on_air.png']";
	public static final String moreFromThisChannel = "//div[@class='footer-content-holder']//div[contains(text(),'More Shows From This Channel')]";
	public static final String myMixLogo = "//div[@class='now-playing-content']//div[@class='now-playing-channel-logo']//span";
	public static final String myMixChannelName = "//div[@class='np-track-show-name']//span[contains(text(),'My  Hits 1')]";
	public static final String mySXMSkipPopUp = "//div[@class='modal-dialog']//h2";
	public static final String mySXMSkipdialogbox = "//div[@class='modal-content']//button[@class='close']";
	public static final String mySXMprogressBar = "//p[@class='playerscrub']//span[contains(@class,'loading-on-demand')]";
	public static final String playfromPopup = "//div[@class='photos']//img[1]";
	public static final String NPL_MLT_Header = "//div[contains(@class,'NPL-view')]//div[@class='second']//span[text()='More Like This']";
	public static final String NPL_MLT_hits1Live = "//div[contains(@ng-class,'mltChannels')]//img[contains(@src,'siriushits1')]/../..//div[@class='subText1']/span[3]";
	public static final String NPL_MLT_hits1MySXM = "//div[contains(@class,'npl-view')]//div[text()='My  Hits 1']";
	public static final String NPL_MLT_hits1 = "//span[contains(@ng-show,'channel.isLive')]";
	public static final String NPL_MLT_hits1_pdt2 = "//div[@class='photos']//img[1]/../..//div[contains(@class,'subText3')]";
	public static final String channelNumber = "//div[@class='now-playing-channel-logo']//div[contains(@class,'channel-number ')]";
	public static final String notificationIcon_OnAir = "//div[@class='indicator-and-duration adjust-volume-icon']/../..//span[contains(@class,'RegularNotification')]";
	public static final String notificationIcon_popup = "//div[contains(text(),'set for start of show')]";
	public static final String showName_Text = "//div[@class='indicator-and-duration adjust-volume-icon']/../..//div[@class='show-title ng-binding']";
	public static final String SegmentshowName_Text = "//div[@class='segment-header']//div[contains(@class,'line-two')]//span";
	public static final String channelsPanel="//.[@id='channelList']//div[@id='channelsPanel']";
	public static final String SegmentShareIcon = "//div[@class='segment-header']//span[@title='Share this']";
	public static final String SegmentFavIcon = "//div[@class='od-playing-channel-logo']//div[contains(@class,'fav-icon-left')]";
    public static final String onDemand="//span[@title='You are listening to an On Demand episode']/..";
    public static final String channelsList="//div[contains(@class,'genre-channel-list')]/div//div[@class='channel-image']/span";
    public static final String skipForward="//span[@title='Skip forward']/..";
    public static final String buyOptionMusicLive="//div[@class='now-playing-content']//div[@ng-show='buyEnabled']";
    public static final String shareOptionhowardsternLiveLive="//div[@class='now-playing-content']//div[@activegroup='share']";
    public static final String shareOptionmymix="//div[@class='now-playing-content']//div[@class='np-icons']";
    public static final String pdtLine1Text="//div[@class='np-track-show-name']//span[text()='My  Hits 1']/../../div[contains(@class,'track-artist')]/span[1]";
    public static final String pdtmiddleText="//div[@class='np-track-show-name']//span[text()='My  Hits 1']/../../div[contains(@class,'track-artist')]/span[2]";
    public static final String pdtLine2Text="//div[@class='np-track-show-name']//span[text()='My  Hits 1']/../../div[contains(@class,'track-artist')]/span[3]";
    public static final String NPL_MLT_AOD="//span[@ng-show='channel.isAod']";
    
	// Me objects

	public static final String logout = "logout-button";
	public static final String MeHeader = "//div[@data-tabheader='Me']";
	public static final String poweredBy = "//div[text()='Powered By: SiriusXM']";
	public static final String buildNumber = ".//*[@class='version-content']//div[contains(text(),'Version Number')]";
	public static final String SprintNo = "//div[contains(text(),'dev/sprint')]";
	public static final String customChannels = "//span[text()='Custom Channels']";
	public static final String customChannel = "//div[contains(@class,'custom-channel-group')]/div[1]/div[1]/div[1]/div[1]/div[3]/span";
	public static final String logoutBtn = "//div[@class='confirm-okay']//span[text()='Log Out']";
	public static final String Hits1Mix = "//div[@class='custom-chn-name']//span[contains(text(),'Hits')]/..";
	public static final String Hits1Mix_PDT = "//div[@class='np-track-show-name']//span[@ng-click='openEDP()']";
	public static final String clear = "//ul[@id='contextMenuCustomChannels']//li[@class='cm-item-fav-clear-two']//div[text()='Delete']";
	public static final String MyNotifications = "//div[@class='settings-panel-download settings-notify']";
	public static final String manage = "//span[text()='manage']";
	public static final String customerAgreement = "//span[contains(text(),'Customer Agreement')]";
	public static final String verifyCustomerAgreementPDF1 = "//div[contains(text(),'CUSTOMER AGREEMENT & WEBSITE TERMS OF USE')]";
	public static final String verifyCustomerAgreementPDF2 = "//div[contains(text(),'THANK YOU FOR CHOOSING SIRIUSXM')]";
	public static final String privacyPolicy = "//span[contains(text(),'Privacy Policy')]";
	public static final String ContinueListeningNotifications = "//span[text()='Continue Listening Notifications']";
	public static final String crossDeviceResume = "//div[@ng-show='crossDeviceResume']";
	public static final String TurnOffAllNotifications = "//span[text()='Turn Off All Notifications']";
	public static final String turnOffNotify = "//div[@class='settings-panel-tune']//div[contains(@ng-show,'turnOffNotify')]";
	public static final String ApplicationHelp = "//span[contains(text(),'Application Help')]";
	public static final String SendFeedback = "//span[contains(text(),'Send Feedback')]";
	public static final String privacyPolicyPDF1="//div[contains(text(),'PRIVACY POLICY')]";
	public static final String meHelp="//div[contains(@class,'tab-item-4')]//div[contains(text(),'Help')]";
	public static final String mePanel="//div[@id='mainRow']/div[2]/div[1]/div[2]/div/div[4]/div/div[1]/div[2]";	
	public static final String meSendFeedBack="//a/span[contains(text(),'Send Feedback')]";
	public static final String playNotification="//div[@class='my-notification-container']/div[1]/div[1]/div[2]/div[1]//div[contains(@class,'notify-sub-head')]";
	public static final String manageNotifcationshowname="//div[@class='panel-group']/div[1]//div[@class='manage-tune-header']";
	public static final String manageNotifcationshowname_edp="//div[@class='entity-detail-header']//div[contains(@class,'selected-show-name ')]";
	public static final String manageNotifcationshowname_swipe="//div[@class='panel-group']/div[1]//div[@class='panel-swipe']/span";
	public static final String removeNotifications="//*[@id='contextMenuCustomChannels']//div[text()='Remove Notification']";
	public static final String removeMyNotifications="//div[@class='my-notification-container']/div[1]/div[1]//div[contains(@class,'RegularModalClose')]";
	public static final String MenotificationBadgeNumber="//div[@class='notification-badge']/span";
	public static final String MynotificationBadgeNumber="//span[contains(@class,'notifcation-number')]";
	public static final String notificationPopup="//div[contains(@class,'normal-notify')]/div[1]//div[contains(@ng-show,'isNotificationAlert')]/div[2]/span";
	public static final String notificationPopupXmark="//div[contains(@class,'normal-notify')]/div[1]//span[contains(@class,'notify-cross')]";
	public static final String sendFeebackFromMe="//div[contains(@class,'settings-panel')]//span[text()='Send Feedback']";
	public static final String NormalAudio="//div[contains(@class,'audio-normal-on')]";
	public static final String HighAudio="//div[contains(@class,'audio-high-on')]";
	public static final String MaximumAudio="//div[contains(@class,'audio-max-on')]";
	public static final String NormalAudiopanel="setting-normal";
	public static final String HighAudiopanel="setting-high";
	public static final String MaximumAudiopanel="setting-maximum";	
	public static final String notificationMgmt="//span[text()='Notification Management']";
	public static final String continuelisteningOn="//div[@class='settings-panel-tune' and @ng-click='toggleCrossDeviceResume()']//div[contains(@class,'panel-tune-on')]";
	public static final String continuelisteningOff="//div[@class='settings-panel-tune' and @ng-click='toggleCrossDeviceResume()']//div[contains(@class,'panel-tune-off')]";
	
	
	
	// Channel Objects

	public static final String popLink = "//div[@class='category-name']//span[contains(text(),'Pop')]";
	public static final String HowardSternSubMenu = "//div[@id='genre-channels-list']//img[contains(@src,'howardstern100')]/../../..";
	public static final String newAndIssues = "//div[@class='category-name']//span[contains(text(),'News & Issues')]";
	public static final String newAndPublicRadio = "//span[contains(text(),'News/Public Radio')]";
	public static final String siriusXM = "//div[@class='channel-image']//span[text()='02']/../../..";
	public static final String pitsbull = "//div[@class='channel-image']//span[text()='04']/../../..";
	public static final String allChannelsLink = "//span[contains(text(),'All Channels')]";
	public static final String allChannelsHeader = "//div[contains(text(),'All Channels')]";
	public static final String siriusxmLogo = "//div[@id='genre-channels-list']//img[contains(@src,'siriushits1')]";
	public static final String siriusxmShowname = "//div[@id='genre-channels-list']//img[contains(@src,'siriushits1')]/../../../div[@class='show']/span[2]";
	public static final String siriusxmPdt1 = "//div[@id='genre-channels-list']//img[contains(@src,'siriushits1')]/../../../div[@class='show']/span[4]";
	public static final String siriusxmPdt2 = "//div[@id='genre-channels-list']//img[contains(@src,'siriushits1')]/../../../div[@class='show']/span[5]";
	public static final String christian = "//span[contains(@class,'sub-category-title') and contains(text(),'Christian')]";
	public static final String nowPlayingLink ="//div[@class='filter']//div[contains(@class,'selected') and text()='Now Playing']";
	public static final String subChannelBack = "//span[@id='selected-category-back']";
	public static final String playChannelNamesList ="(//span[contains(@class,'channel-disp-name')])[1]";
	public static final String channelInfoIcon = "(//ul[@id='channelsListContext']/li/div[@class='dvAnc']/div[contains(@class,'RegularInfo')])[1]";
	public static final String playChannelFavIcon = "(//ul[@id='channelsListContext']/li/div[contains(@class,'favorite-section')]//div[1])[1]";
	
	public static final String channelsSubCatBackButton = "//div[@id='categorySection-Back']/span[2]";
	public static final String sportsLink = "//div[@class='category-name']//span[contains(text(),'Sports')]";
	public static final String sportsHeader = "//div[@id='categorySection-Back']/div[contains(text(),'Sports')]";
	
	public static final String HowardSternChannel = "//div[@class='show']//span[contains(text(),'Howard Stern')]";
	public static final String Comedychannel = "//div[@class='show']//span[contains(text(),'Comedy Central Radio')]";
	public static final String cnbc = "//div[@class='channel-image']//img[contains(@src,'cnbc')]";
	public static final String Music = "//div[@class='category-name']//span[contains(text(),'Music')]";
	public static final String talkEntertainment = "//div[@class='category-name']//span[contains(text(),'Talk & Entertainment')]";
	public static final String HowardSternMenu = "//div[@class='category-name']//span[contains(text(),'Howard Stern')]";
	public static final String Comedy = "//div[@class='category-name']//span[contains(text(),'Comedy')]";
	//public static final String Venus = "//div[@id='channel-1']//div[@chn-id='03']//div[@class='show']//span[2]";
	public static final String Venus = "//div[@class='show']//span[text()='Venus']/../..";
	public static final String pitBullChannel = "//span[contains(text(),'Pitbull')]";
	public static final String pitbullsChannel = "//div[@class='show']//span[contains(text(),'Pitbull')]/../..";
	public static final String Ondemand = "option-ondemand-shows";
	public static final String nowPlaying = "//div[text()='Now Playing']";
	public static final String MusicList = "//span[contains(@class,'sub-category-title-text ')]";
	public static final String Pop_List = "//div[@panel='channels-list']//span[contains(@class,'channel-disp-name')]";
	public static final String Categories = "//div[contains(@class,'categories-scroll-list')]//span[contains(@class,'category-title-text')]";
	public static final String ondemandshowsTab = "option-ondemand-shows";
	public static final String ondemandshowsList = "//div[contains(@class,'on-demand-list')]//span[contains(@class,'channel-disp')]";
	public static final String channelScroller = "//div[@id='subCategoryList']//div[contains(@class,'mCSB_container')]";
	public static final String sportsMenu = "//div[@class='category-name']//span[contains(text(),'Sports')]";
	public static final String familyMenu = "//div[@id='category-title-140-2']//span[contains(text(),'Entertainment')]";
	public static final String sportsSubMenu = "//div[contains(@class,'category-group category-item sub-category-item')]//span[contains(text(),'Sports')]";
	public static final String maddog = "//span[text()='82']/..//img";
	public static final String ruralRadio = "//div[@class='channel-image']//span[text()='147']/..";
	public static final String newsandIssues = "//span[contains(text(),'News & Issues')]";
	public static final String newsPublicRadio = "//span[contains(text(),'News/Public Radio')]";
	public static final String channelImages = "//div[@id='genre-channels-list']//div[@class='channel-image']//img";
	public static final String onDemandTab = "option-ondemand-shows";
	public static final String AODImages = "//div[@class='aod-channel-image']//img";
	public static final String EpisodeListMenu = "//div[@class='ondemand-disp-name']//span";
	public static final String AvailableSegments = "//span[text()='Available Segments']/..";
	public static final String youJustHeard = "//span[text()='you just heard']/..";
	public static final String editCustomMix = "//span[contains(text(),'MODIFY CUSTOM MIX')]";
	public static final String customMix = "//div[@class='custom-section-header']//span[4]";
	public static final String slider1 = "//div[contains(@class,'slider-content')]/div[1]/div[1]//div[@class='mySxmSlider']/div[1]/div[1]";
	public static final String sliderPosition1 = "//div[contains(@class,'slider-content')]/div[1]/div[1]//div[@class='mySxmSlider']/div[1]/div[5]";
	public static final String SaveMix = "//div[contains(text(),'Save My Mix')]";
	public static final String Cancel_slider = "//div[contains(text(),'Cancel')]";
	public static final String sliderPosition2 = "//div[contains(@class,'slider-content')]/div[1]/div[1]/div[1]";
	public static final String ChannelSwipe = "//div[@id='channel-0']//span[contains(@class,'RegularSwipe')]";
	public static final String ChannelSwipe_favoriteIcon = "//ul[@id='channelsListContext']//li[@class='cm-item-two']//div[contains(@class,'dvAnc')]//div[1]";
	public static final String NPL_favoriteIcon = "//div[@class='now-playing-channel-logo']//div[4]";
	public static final String Hits1FromRecents = "//img[contains(@src,'siriushits1')]/../../../..//div[@class='rec-content']/div[contains(@class,'ng-hide')]";
	public static final String Show_infoicon = "//div[@class='track-icons']//span[@title='Opens the show information page']";
	public static final String ShowName = "//div[@class='track-header']//div[contains(@class,'track-title')]";
	public static final String ShowName_NPL = "//div[@class='now-playing-channel-info']//span[contains(@class,'np-show-tap-name')]";
	public static final String favoriteNearrestartShows = "//*[@id='nowPlaying']/div/div[2]/div[3]/div/div[1]/div[2]/span[4]";
	public static final String skipBack15Secs = "//span[@title='Skip back 15 seconds']/..";
	public static final String favoriteHits = "//img[contains(@src,'siriushits1')]/../../..//div[@class='fav-channel-descption']/span[(@class='fav-channel-disp-name ng-binding ng-hide')]";
	public static final String kids = "//div[@class='category-name']//span[contains(text(),'Kids')]";
	public static final String kidzbopChannel = "//div[@class='show']//span[contains(text(),'KIDZBOP')]";
	public static final String sharemyMix = "//div[@class='np-icons']";
	public static final String shareFBMyMix = "//ul[@id='shareTrackContextView']//div[text()='Share on Facebook']";
	public static final String shareTweetMyMix = "//ul[@id='shareTrackContextView']//div[text()='Share on Twitter']";
	public static final String shareBuyMyMix = "//div[@class='np-icons buy-content']";
	public static final String shareBuyMyMix_itunes = "//ul[@id='buyContextView']//div[text()='Buy on iTunes']";
	public static final String shareBuyMyMix_google = "//ul[@id='buyContextView']//div[text()='Buy on Google Play']";
	public static final String shareBuyMyMix_Amazon = "//ul[@id='buyContextView']//div[text()='Buy on Amazon']";
	public static final String nplChannelFavIcon = "//div[@class='now-playing-channel-logo']/div[4]";
	
	
	
	
	
    public static final String npltweetIcon="//div[contains(@class,'widget-holder')]//div[2]//div[@id='tweetIcon']/div";
    public static final String npltweetOtherIcons_Replay="//div[contains(@class,'widget-holder')]//div[2]//div[contains(@class,'tweet-other-icons')]//a[contains(@href,'reply')]";
    public static final String npltweetOtherIcons_Retweet="//div[contains(@class,'widget-holder')]//div[2]//div[contains(@class,'tweet-other-icons')]//a[contains(@href,'retweet')]";
    public static final String npltweetOtherIcons_tweetFav="//div[contains(@class,'widget-holder')]//div[2]//div[contains(@class,'tweet-other-icons')]//a[contains(@href,'favorite')]";
    //channel objects or channel segments	
	
	// Channels Segments
	public static final String verifyTopViewAllSegments = "//span[@class='toggle-button-segment-header']/span[contains(text(),'View All Segments')]";
	public static final String verifyCompressTopViewAllSegments = "//span[@class='toggle-button-segment-header']/span[contains(text(),'Hide Segments')]";
	public static final String verifyBottomViewAllSegments = "//div[@class='toggle-button-segment']/span[contains(text(),'View All Segments')]";
	public static final String verifyCompressBottomViewAllSegments = "//div[@class='toggle-button-segment']/span[contains(text(),'Hide Segments')]";
	public static final String channelListItem = "(//div[@class='search-chn-tune'])[1]";

	public static final String goToLiveRadio = "//span[@title='Skip to Live radio']";
	public static final String channelsegmentPDT = "//div[@class='now-playing-channel-info']/div[@class='line-track']/span[1]";
	public static final String espnRadio = "//div[@class='channel-image']/span[contains(text(),'83')]/../img[contains(@src,'espnradio-1')]";
	public static final String playerHead = "//div[@id='player']";
	public static final String playerHeadsxmLogo = "//div[@id='player']/div[@class='sxm-logo']";
	public static final String playerHeadVolumeIcon = "//div[@id='player']//div[@class='full']//div[contains(@class,'play-volume')]";
	public static final String playerHeadGoToLive = "//div[@ng-click='goToLive()']";
	public static final String playerHeadVolumeControl = "//div[@id='volumeControl']";
	public static final String playerHeadVolumeControlSlider = "//div[@id='volumeControl']/div";
	public static final String playerHeadVolumeControlScrubber = "//div[@id='volumeControl']/a";
	public static final String recentChannelList = "//div[@class='rec-content']//div[@class='show']//span[contains(@class,'channel-disp-name')]";
	public static final String artistiFrame = "//iframe[contains(@id,'_artist_bio')]";
	public static final String artistName = "artistName";
	public static final String artistDesc = "//div[@id='artistDescription']";
	public static final String artistViewFull = "viewMore";
	public static final String artistViewLess = "viewLess";
	public static final String expandCampanionContent = "//div[@id='nowPlaying']/div[@class='now-playing-content']/div[2]//div[@class='companion-content']//span[@tabindex='74']";
    public static final String selectSegment = "//div[@id='nowPlaying']/div/div[2]/div[3]/div/div[6]/div/div[3]/div[2]/span";
	// public static final String
	// collapseCampanionContent="//div[@class='np-complimentary-content']//span[@title='Collapse content']";
	public static final String campanionContentCount = "//div[@class='count-display']/div[contains(@class,'display-widget-count')]";
	public static final String channelsegmentPDTAll = "//div[@class='now-playing-channel-info']/div[@class='line-track']/span";

	// Favorite objects

	public static final String favoriteIcon = "//div[@id='nowPlaying']//div[@class='now-playing-image']/img/../../div[4]";
	public static final String favouritesLeftMenu = "(//span[@title='Favorite channels and shows'])[1]";
	public static final String favChannelMenu = "(//div[@class='fav-chn-content']/div/span[@title='Menu'])[1]";
	public static final String addToFavsText = "//ul[@id='channelContextView']//li[@class='cm-items-search-fav']//span[text()='Add to Favorites']";
	public static final String favoriteList = "//div[@class='fav-channel-descption']//span[contains(@class,'fav-channel-disp-name')]";
	public static final String favoriteShow = "//div[@class='btn-group']//div[contains(text(),'shows')]";
	public static final String ContextClickfavoriteList = "//ul[@id='channelsListContext']//li[@class='cm-item-two']//div[contains(@class,'dvAnc')]/div[1]";
	public static final String channel_listElasticity1 = "id_03_live";
	public static final String channel_listElasticity2 = "id_02_live";
	public static final String favChannelSwipe = "//div[@id='id_02_live']//div[contains(@class,'fav-chn-context')]//span[contains(@class,'RegularSwipe')]";
	public static final String favChannelSwipe_favoriteIcon = "//ul[@id='favChannelsContext']//li[@class='cm-item-two']//div[contains(@class,'dvAnc')]//div[1]";
	public static final String favChannelSwipe_infoIcon = "//ul[@id='favChannelsContext']//li[@class='cm-item-three']//div[contains(@class,'dvAnc')]//div[1]";
	public static final String favShowName = "//div[@class='fav-shows-list ui-sortable']/div[1]//span[contains(@class,'channel-show-name')]";
	public static final String favMyHits ="(//div[@class='fav-channel-descption']//span[contains(@class,'fav-channel-my-name') and text()='My  Hits 1'])[1]";

	
	
	
	

	// search objects
	public static final String searchTextBox = "searchInput";
	public static final String contextualMenu = "(//div[@title='Menu'])[1]";
	public static final String showContextualMenu ="(//div[@title='Menu'])[11]";
	public static final String autoSuggest1 = "//div[contains(@class,'search-filter-section')]/div[1]//span[2]";
	public static final String autoSuggest2 = "//div[contains(@class,'search-filter-section')]/div[2]//span[2]";
	public static final String autoSuggest3 = "//span[text()='Howard 100']";
	public static final String autoSuggest4 = "//span[text()='Howard 101']";
	public static final String autoSuggest5 = "//span[text()='Howard 100 on Ch. 100']";
	public static final String clearSearchLink = "//span[text()='Clear Search History']";
	public static final String searchLabel = "//span[text()=' Search']";
	public static final String channelHeaderLabel = "(//span[text()=' CHANNELS '])[1]";
	public static final String channelHeaderText = "//div[@class='scroll-content']/div[2]//span[text()=' Channels ']";
	public static final String episodeHeaderText = "(//span[text()='Episodes' and contains(@class,'search-ondemand-all-episodes')])[1]";
	public static final String seeAllOndemandBackLink ="(//span[text()='back' and contains(@class,'search-od-back')])[1]";
	public static final String onDemandLogo = "(//span[contains(@class,'search-ondemand-logo')]/img[contains(@class,'od-img')])[1]";
	public static final String episodesLabel = "(//span[contains(@class,'search-ondemand-episode')])[1]";
	public static final String seeAllShowsLabel ="(//span[(contains(@class,'show-header-title') and text()='Shows')])[1]";
	public static final String showsLabel = "(//span[text()='SHOWS'])[1]";
	public static final String howardLink = "//div[contains(@class,'recent-search-item') and text()='howard']";
	public static final String venusChannelLabel = "//span[(contains(@class,'channel-name') and text()='Venus')]";
	public static final String venusShowsLabel = "//span[(contains(@class,'sh-title') and text()='Venus')]";
	public static final String venusShowsEdp = "//div[@class='show-content']/div[text()='Venus']";
	public static final String searchPlaceHolder = "//input[@placeholder='Search']";
	public static final String howardChannelLink = "//span[(contains(@class,'channel-name') and text()='Howard 100')]";
	public static final String edpHowardLink = "//div[@class='line-show-name']/span[text()='Howard Stern Show']";
	public static final String liveLabel = "//span[text()='live']";
	public static final String verifyRecentSearchLabel = "//div[@class='recent-searches']/span[text()='Recent Searches']";
	public static final String cancelButtonSearch = "//div[@class='search-cancel']/span[text()='Cancel']";
	public static final String channelShortDescription1 = "//span[contains(@class,'channel-description') and text()='The Howard Stern Show.']";
	public static final String channelShortDescription2 = "//span[contains(@class,'channel-description') and text()='The World of Howard Stern Never Stops.']";
	public static final String seeAllResultsLink = "//div[@class='search-live-more']/div/span[text()='See All Results For \"howard\"']";
	public static final String autoSuggest6 = "//span[text()='Howard 101 on Ch. 101']";
	public static final String cancel = "//div[@class='search-cancel']//span[text()='Cancel']";
	public static final String searchMagnifiericon = "//div[@ng-click='search()' and contains(@class,'RegularSearch')]";
	public static final String noResultText = "//div[@class='search-no-result']//span";
	public static final String searchAllLink = "search-live-more";
	public static final String channelsHeading = "//div[@class='search-channel-header']//span[contains(text(),'CHANNELS')]";
	public static final String showsHeading = "//div[@class='search-show-header']//span[contains(text(),'Shows')]";
	public static final String cancelSearch = "//div[@class='search-close']//div";
	public static final String recentSearchesHeading = "//span[text()='Recent Searches']";
	public static final String clearRecentHistory = "//span[text()='Clear Search History']";
	public static final String emptySearch = "//div[@class='search-empty-template']//span";
	public static final String autoSuggestResults_Panel = "//div[contains(@class,'search-filter-section')]";
	public static final String AOD_Show_searchResults = "//div[@class='search-ondemand-header']/..//div[@class='search-ondemand-title']//span[contains(@class,'search-ondemand')]";

	// Recent Objects
	public static final String recentPlayedLiveChannel = "//div[@class='rec-scroll-inner']/div[1]//img";
	public static final String mymixHits1_recents = "//span[contains(text(),'My  Hits 1')]";
	
	public static final String recentlyPlayedVenusChannel="//span[contains(text(),'Venus')]";
    public static final String recentlyPlayedMyHitsChannel="//div[contains(@class,'recently-played-list')]//div[@class='rec-scroll-inner']//div[@class='show']//span[contains(text(),'My  Hits 1')]";
    public static final String recentFirstRegularSwipe="//div[contains(@class,'recently-played-list')]//div[@class='rec-scroll-inner']//div[1]//div[contains(@class,'custom-rec-contextual')]/span";
    public static final String recentVenusRegularSwipe="//div[contains(@class,'recently-played-list')]//div[@class='rec-scroll-inner']//div[@class='show']//span[contains(text(),'Venus')]/../../../../div[contains(@class,'custom-rec-contextual')]/span";
    public static final String recentMyHitsRegularSwipe="//div[contains(@class,'recently-played-list')]//div[@class='rec-scroll-inner']//div[@class='show']//span[contains(text(),'My  Hits 1')]/../../../../div[contains(@class,'custom-rec-contextual')]/span";
    public static final String recentlySwipeFavIcon="//ul[@id='contextMenuRecentChannels']//li[contains(@class,'add-recent-fav')]//div[contains(@class,'dvAnc')]//div[1]";
    public static final String recentlySwipeInfoIcon="//ul[@id='contextMenuRecentChannels']//li[contains(@class,'add-recent-info')]//div[@class='dvAnc']//div[1]";
    public static final String recentlySwipeClearIcon="ul[id='contextMenuRecentChannels'] li[class*='add-recent-clear'] div[class*='dvAnc']";
    public static final String recentListClear="//div[@id='recentlyPlayed']//div[@class='head']//div[@class='rec-clear']/span";
    public static final String recentListClearOKay="//div[@id='faultTreeAlert']//div[@class='button-ok']/div[@class='confirm-okay']";
    public static final String noRecentList="//div[@ng-show='model.isRecentlyPlayedEmptyView']//div[@class='recent-template-header']/span";
    public static final String listDispName="//div[contains(@class,'recently-played-list')]//span[contains(@class,'channel-disp-')]";
    public static final String recent_fav_unFav=" //ul[@id='contextMenuRecentChannels']//div[@ng-click='toggleRecentFavorite($event)']/div[1]";
    public static final String recent_clear="//ul[@id='contextMenuRecentChannels']//li[contains(@class,'add-recent-clear')]/div[2]/div[2]/..";
	// ChannelEDP

	public static final String channelEDPPage = "//div[@id='entity-detail-page']";
	public static final String closeEDP = "//div[@title='Close page']";
	public static final String channelEDP_favorite = "//div[@class='selected-channel-icons']//span[@ng-click='toggleShowFavorite()']";
	public static final String channelEDP_share = "//div[@class='selected-channel-icons']//span[contains(@class,'RegularShare')]";
	public static final String channelEDP_channelLogo = "div[class='entity-detail-header'] img[src*='streaming']";
	public static final String channelEDP_channelName = "//div[@class='entity-detail-header']//div[contains(@class,'selected-channel-name')]";
	public static final String channelEDP_channeldescription = "//div[@class='entity-detail-header']//div[contains(@class,'selected-channel-description')]";
	public static final String channelEDP_upcomingShows = "//span[text()='upcoming shows']";
	public static final String channelEDP_channelNumber = "//div[contains(@class,'selected-channel-number')]";
	public static final String channelEDP_shareFB = "//ul[@id='EDPShareContextView']//div[text()='Share on Facebook']";
	public static final String channelEDP_sharetwitter = "//ul[@id='EDPShareContextView']//div[text()='Share on Twitter']";
	public static final String channelEDP_connectModule_MobileNo = "//div[@class='channel-header']//span[@title='Phone number for Channel']";
	public static final String channelEDP_connectModule_MobileNo_image = "//div[@class='channel-header']//img[@title='Phone number for Channel']";
	public static final String channelEDP_connectModule_email_image = "//div[@class='channel-header']//img[@title='Send email']";
	public static final String channelEDP_connectModule_email_address = "//div[@class='channel-header']//span[@title='Send email']";
	public static final String channelEDP_connectModule_fb_Link = "//div[@class='channel-header']//span[@title='See Facebook profile']";
	public static final String channelEDP_connectModule_fb_image = "//div[@class='channel-header']//img[@title='See Facebook profile']";
	public static final String channelEDP_connectModule_Tweet_Image = "//div[@class='channel-header']//img[@title='See Twitter profile']";
	public static final String channelEDP_connectModule_Tweet_Link = "//div[@class='channel-header']//span[@title='See Twitter profile']";
	public static final String channelEDP_upcomingShowsEDPimage = "//div[@class='edp-show-image']//img";
	public static final String channelEDP_selectedChannelName = "//div[contains(@class,'channel-content-name')]/div[contains(@class,'selected-channel-name')]";
	public static final String channelEDP_ConnectModule="//div[@class='selected-channel-section']//div[@class='connect']";
    public static final String channelEDP_ConnectModuleList="//div[@class='selected-channel-section']//div[@class='connect-container']//div";
    public static final String channelEDP = "//div[@class='logo-img-section']/img[@title='Opens the channel information page']";
    public static final String contextMenu_channelEDP = "//ul[@id='channelsListContext']//li[@class='cm-item-three']//div[text()='Channel Info']";
    
    // AOD
	public static final String onDemandSubmenu ="(.//*[@id='showItems-0']/div/div[1]/div[2]/div/span)[1]";    
    public static final String episodeLink ="//*[@id='entity-detail-page']/div[2]/div/div[@class='selected-show-favorite-episodes ng-scope']/div/div[1]/div[2]/span";
    public static final String episodeshareIcon ="//*[@id='entity-detail-page']/div[2]/div/div[@class='selected-show-favorite-episodes ng-scope']/div//span[contains(@class,'RegularShare')]";
    public static final String logoVerification = "//*[@id='onDemandNowPlaying']/div[1]//div[@class='top-section']/div[@class='logo-img-section']/img";
    public static final String onLogoicon = "//div[@class='top-section']/div[@class='channel-number ng-binding']/span[@class='RegularCh_OD']";
    public static final String playerText="//div[@class='scrub-controls']/div[@class='dynamic-play-control']/div[2]/span";
    public static final String playerTextOnDemand="//div[@class='scrub-controls']/div[@class='dynamic-play-control']/div[2]";
    public static final String popSubmenu=".//*[@id='category-title-10-0']/div/span[1]";
    public static final String onDemandPDT="//div[@class='np-show meta-show-un-able meta-show-navbar-open']/div[@class='np-track-artist meta-track-un-able']/span[1]";
    public static final String favIcon=".//*[@id='onDemandNowPlaying']/div[1]//div[@class='top-section']/div[4]";
    //public static final String favIcon=".//*[@id='onDemandNowPlaying']/div/div[1]/div[1]/div[@class='top-section']/div[3]";
    public static final String shareLink="//*[@id='onDemandNowPlaying']/div/div[1]/div[2]/div[4]";
    public static final String favIconShow="//*[@id='entity-detail-page']/div[2]/div/div[@class='selected-show-favorite-episodes ng-scope']/div/div[2]/span[1]";
    public static final String favShowstab="//div[text()='shows']";
    public static final String favShowsName="//*[@class='fav-list-item  ui-state-default ng-scope']/div/div/div/div[2]/div/span[1]";
    public static final String favShowsPDT=" //*[@id='entity-detail-page']/div[2]/div/div[@class='selected-show-favorite-episodes ng-scope']/div/div[1]/div[@class='episode-name']/span[1]";
    public static final String favshowEmpty="//*[@id='favoritesList']/div[3]/div[2]/div[@class='fav-shows']/div[2]";                                                                  
    public static final String favPanel="//*[@class='fav-list-item  ui-state-default ng-scope']/div/div/div/div[2]/div/span";
    public static final String recendAODlist="//div[@class='recently-played-list rec-scroll-outer']//div[@class='rec-scroll-inner']//span[contains(@class,'ng-binding channel-sp on-demand-title')]";
    public static final String popFirstChannel="//*[@id='channel-0']/div/div[1]/div[@class='content']/div[@class='show']/span[4]";
    public static final String mltinAOD="//div[@class='mlt-container']";
    public static final String aod_Segment="//*[@id='onDemandNowPlaying']/div/div[2]/div[3]/div[1]";
    public static final String onDemandMiniLogo= "//span[@class='RegularCh_OD']";
    public static final String trackShowName = "//span[contains(@class,'track-show-name') and text()='Howard Stern Show']";
    public static final String onDemandImage = "//div[@class='logo-img-section']//img[@class='logo-proportion' and contains(@ng-src,'howardstern100')]";
    public static final String edpChannelName = "//div[@id='entity-detail-page']//div[@class='channel-content']/div[1]";
    public static final String pdtTEXT1 = "//div[@id='onDemandNowPlaying']//div[contains(@class,'np-track-artist')]/span[2]/../span[text()='-']/../span[3]";
    public static final String edpShowName = "//div[contains(@class,'selected-show-name') and text()='Howard Stern Show']";
    
    public static final String available_Segment_Text="//div[@class='od-segment']/div[@class='segment-list']/div[@class='previous-segments ng-binding enableCursor']";
    public static final String segmentList="//div[@class='segment-description ng-binding']";
    public static final String segmentPDT ="//div[@class='od-content-type ng-scope']/div[@class='od-playing-channel-info']/div[@class='line-two ng-binding']/span[3]";
    public static final String footer_more_Episodes =".//div[@class='od-recent-episodes']/div[@class='content-holder-one']/div";
    public static final String footer_more_Shows =".//div[@class='od-footer']/div[@class='content-holder']/div";
    public static final String footer_logo =".//div[@class='od-footer']/div[@class='footer-channel-logo']/img";
    public static final String edpverification=".//*[@id='entity-detail-page']/div[@class='entity-detail-container container-nav-open']//div[@class='entity-container-content-right']";
    public static final String consumption_indicator ="//*[@id='entity-detail-page']/div[2]/div/div[5]/div/div[1]/div[1]/div[2]/div";
    public static final String segmentvalforRestAOD="//*[@id='onDemandNowPlaying']/div/div[2]/div[4]";
    public static final String aodback15enableanchor="//*[@id='onDemandNowPlaying']/div/div[2]/div[4]";
    public static final String contxtaodaddfav="//span[text()='Add to Favorites']";////*[@id='contextMenuRecentChannels']/li[@class='cm-item-clear add-recent-fav']
    public static final String contxtaodrmvfav="//span[text()='Remove from Favorites']";////*[@id='contextMenuRecentChannels']/li[@class='cm-item-clear add-recent-fav']
    public static final String contxtaod="//span[contains(@class,'RegularSwipe context-0')]";//span[contains(@class,'RegularSwipe context-'1')]
    public static final String contxtaodclr="//*[@id='contextMenuRecentChannels']/li[@class='cm-item-clear add-recent-clear']//div[text()='Clear']";
    public static final String applsettings="//span[text()='Application Settings']";
    public static final String maxaudiostreamcheck="//div[@class='setting-maximum']//div[2]";
    public static final String maxaudiostreamclick="//div[@class='audio-max-off']";//contains(@ng-show,'audioMaxOn')]";
    public static final String highaudiostream="//div[@class='setting-high']//div[@class='audio-high-off']";
    public static final String ymlcount="//div[@class='show all-channel-show show-ymal']//span[3]";//div[@class='rec-scroll-inner all-recommend-list']//div[@class='ng-scope']";
    public static final String ymlondemand="//div[@class='show all-channel-show show-ymal']//span[3]";//@class='ymal-show-title ng-binding on-demand-title']";
    public static final String ymlchannelinf="//div[contains(text(),'Channel Info')]";
    public static final String notificationicon="//div[@class='show-list sl-last-bb']//div[@class='show-sharing']//span[1]";//div[@class='show-item']//div[@class='show-sharing']//span[1]";
    public static final String channelPDT="//*[@id='nowPlaying']//div[@class='show-title ng-binding']";//div[@class='show-item']//div[@class='show-details']//div[@class='show-title ng-binding']";       
    public static final String myNotification="//div[@class='settings-panel-download settings-notify']//div[@class='settings-notify-text']//span[text()='My Notifications']";
    public static final String notificationchanneltxt="//div[@class='ng-scope']//div[@class='notification-sec']//div[@class='my-notify-data']//div[1]//div[@class='notify-sub-head ng-binding']";
    public static final String notificationpopup="//div[@class='set-notify-panel set-notify-animation notify-text ng-binding show-notify']";
  																												// the
    public static final String AvailableSegmentsAOD="//div[contains(text(),'AVAILABLE SEGMENTS')]";		
    public static final String viewAllSegmentsAOD=" //span[contains(text(),'View All Segments')]//channel";
    public static final String channelCategory=       "//div[@id='categoryList']//span[contains(@class,'category-title-text')]";                                                                                                                                                                                                 
    public static final String channelSubCategory="//div[@id='subCategoryList']//span[contains(@class,'sub-category-title-text')]";
    public static final String aodCampanionContent="//div[@class='od-companion-content']//span[@class='RegularModalClose']";                                                                                                                                                                                                                                                        
    public static final String aodcampanionContentCount="//div[@id='onDemandNowPlaying']/div/div[2]/div[1]/div/div[1]/span";
    public static final String aodcampanionContentCountMusic="artistDescription";
    //public static final String restartEpisode="//span[text()='Restart Episode']";
    public static final String restartEpisode="//div[@ng-show='model.enableRestart']/span[text()='Restart Episode']/../span";
    public static final String clickAODsegment="//div[@class='od-segment']//div[6]//div[contains(@class,'segment-description')]"; 
 
    public static final String aodCompanionContentclose="//div[@id='onDemandNowPlaying']/div/div[2]/div[1]/div/div[1]/span";
    
    public static final String playLiveshow="//div[contains(@ng-show,'selectedChannelEDP')]//div[@class='on-air-now-container']";
    public static final String AODYJH="//div[contains(@class,'show-track-first-')]//div[@class='track-image']";																																						// information
    public static final String AODYJHShare="//div[@class='yjh-share-track']//span";			
    public static final String AODYJHFB="//ul[@id='playedSegmentShareContext']//div[text()='Share on Facebook']";
    public static final String AODYJHTwitter="//ul[@id='playedSegmentShareContext']//div[text()='Share on Twitter']";
    public static final String AODYJHBuy="//div[@class='yjh-buy-track']";
    public static final String AODYJHiTunes="//*[@id='playedSegmentBuyContext']//div[text()='Buy on iTunes']";
    public static final String AODYJHigoogle="//*[@id='playedSegmentBuyContext']//div[text()='Buy on Google Play']";
    public static final String AODYJHiAmazon=".//*[@id='playedSegmentBuyContext']//div[text()='Buy on Amazon']";
    
    
  

	// show objects

    public static final String OndemandShowEDP=".//*[@id='onDemandNowPlaying']/div[1]/div/div/div/div[2]/div[2]/span";
    public static final String OndemandShowEDP_Music="//div[@class='np-show']/div[2]/span";
    public static final String ShowEDP="//div[@class='now-playing-content']//span[contains(@class,'track-show-name')]";
    public static final String ShowEDP_AOD_Music=".//*[@id='onDemandNowPlaying']/div[1]/div/div/div/div[2]/div[2]/span";
    public static final String ShowEDP_AOD_artistName=".//*[@id='onDemandNowPlaying']/div[1]/div/div/div/div[2]/div[3]/span[1]";
    public static final String ShowEDP_AOD_ShareIcon="//div[@class='np-icons']//div[contains(@class,'RegularShare np-share-icon')]";
    public static final String ShowEDP_AOD_showName="//div[@class='np-track-show-name']//span[contains(@class,'track-show-name')]";
  
  
  
	public static final String VerifyShowEDP = "//div[@class='show-header']";
	public static final String ViewAvailableEpisodesinNPL = "//div[@class='ondemand-cta']//div[contains(@class,'available-episodes')]";
	public static final String VerifyShowEDPname = "//div[@class='show-header']//div[@class='selected-show-name ng-binding']";
	public static final String VerifyShowEDPDesc = "//div[@class='entity-detail-header']//div[contains(@class,'selected-show-description')]";
	public static final String VerifyShowEDPAlbumArt = "//div[@class='show-image']";
	public static final String nextAiring = "//div[@class='selected-show-next-airing']//span[contains(@ng-show,'nextAirTime')]";
	public static final String parentchildlogoshowedp = "div[class*='channel-content '] img[src*='streaming.siriusxm']";
	public static final String parentchilddescshowedp = "//div[contains(@class,'channel-content ')]//div[contains(@class,'channel-content-name')]";
	public static final String onAirhowedp = "//div[@class='on-air-now-show-name']//img";
	public static final String VerifyShowEDPShare = ".//*[@class='icon-space RegularShare']";
	public static final String VerifyShowEDPFavorite = "//div[@class='show-header']//span[@ng-click='toggleShowFavorite()']";
	public static final String VerifyShowEDPNotification = "//div[@class='selected-show-icons']//span[@ng-click='setNotification()']";
	public static final String ShowEDP_Back = "//div[@class='back']//span[contains(text(),'back')]";
	public static final String ShowEDP_Close = "//div[@ng-click='closeChannelEDP()']";
	public static final String shownameNonMusic = "//div[@class='line-show-name']/span";
	public static final String showPhoneNumber ="//div[@class='selected-show-section']//span[@title='Phone number for Channel']";
	public static final String showPhoneNumberImage ="//div[@class='selected-show-section']//img[@title='Phone number for Channel']";
	public static final String showemailImage ="//div[@class='selected-show-section']//img[@title='Send email']";
	public static final String showemail ="//div[@class='selected-show-section']//span[@title='Send email']";
	public static final String showeFB ="//div[@class='selected-show-section']//span[@title='See Facebook profile']";
	public static final String showeFBImage ="//div[@class='selected-show-section']//img[@title='See Facebook profile']";
	public static final String showeTwitterImage ="//div[@class='selected-show-section']//img[@title='See Twitter profile']";
	public static final String showeTwitter ="//div[@class='selected-show-section']//span[@title='See Twitter profile']";
	
	/*
	 * 
	 *  Welcome.java element path
	 * 
	 */
	public static final String welcomescreen = ".//*[@id='welcomeData']//span[text()='Welcome']";
	public static final String welcomescreencarousel = "wCarousel";
	public static final String carouselDivPath = "//div[@id='wCarousel']/div[@class='viewport']/ul[@class='overview']";
	public static final String welcomeMessagePath = "//div[@id='welcomeData']/div[@class='welcome-list-content']/div[@class='ws-list-header']/div[contains(@class,'ws-msg-welc')]/span";
	public static final String pickChannelPath = "//div[@id='welcomeData']/div[@class='welcome-list-content']/div[@class='ws-list-header']/div[@class='ws-msg-lis']/span";
	
	/*
	 * 
	 * Search.java elements path
	 * 
	 */
	
	public static final String seeAllChannelResultsPath = "//div[contains(@class,'search-bar-channel-item-4')]//span[text()='See all Channel results']";
	public static final String seeAllOnDemandEpisodesPath = "//div[contains(@class,'search-ondemand-item-4')]//span[text()='See all On Demand Episodes']";
	public static final String seeAllShowsResultsPath = "//div[contains(@class,'search-show-item-4')]//span[text()='See all Shows results']";
	
	public static final String searchChannelBackButtonPath = "span.search-channel-back.ng-binding";
	public static final String searchOnDemandBackButtonPath = "span.search-od-back.ng-binding";
	public static final String searchShowsBackButtonPath = "span.search-show-back.ng-binding";
	
	public static final String getChannelListPath = "div.search-result > div.scroll-content > div[ng-show='isShowChannel']";
	public static final String getOnDemandListPath = "div.search-result > div.scroll-content > div[ng-show='isShowOnDemand']";
	public static final String getShowsListPath = "div.search-result > div.scroll-content > div[ng-show='isShowChannelShows']";
	
	public static final String seeAllChannelResults = "//div[contains(@class,'search-bar-channel-item-4')]//span[text()='See all Channel results']";
	public static final String backButtonAllchannels = "//div[@class='scroll-content']/div[2]//span[text()='back']";
	public static final String seeAllonDemandResults = "//div[contains(@class,'search-ondemand-item-4')]//span[text()='See all On Demand Episodes']/..";
	public static final String seeAllShowResults = "//div[contains(@class,'search-show-item-4')]//span[text()='See all Shows results']/..";
	
	//New
	public static final String np_notificationIcon = "//span[contains(@class,'icon-right RegularNotification')]";
	public static final String me_manageNotifications = "//span[@class='tune-header manage-show-name ng-binding']";
	public static final String np_showName="//div[@class='np-track-show-name']//span[contains(@class,'np-track-show-tap-name')]";
	public static final String np_miniPlayer="//span[text()='MINI PLAYER']";
	public static final String np_fullPlayer="//span[text()='FULL PLAYER']";
	public static final String scrub=".//*/span[@ng-show='isScrub']";
	public static final String aod_pdtTxt1=".//*[@id='onDemandNowPlaying']/div[1]//div[2]//span[3]";
	public static final String npchannel_ymal="//div[@class='now-playing-content']//span[text()='you may also like']";
	public static final String EDP_ymal=".//*[@id='entity-detail-page']//span[text()='you may also like']";
}
