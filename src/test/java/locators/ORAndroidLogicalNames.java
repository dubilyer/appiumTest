//package locators;
//
////naming or convention Object logical name + Object Location on the App + Page (P) /Pop up (PU) + identifying ( name/ id /xpath) like _id
////for JsonRoot :UserNameLogInP_id
//public class ORAndroidLogicalNames {
//
//	public static class CreditCardFormLocatorsRU extends GetTaxiLocators {
//		//Adi
//		public final static WebLocator CARD_NUMBER = new WebLocator("iPAN", ELocatorType.ID, "CARD_NUMBER");
//		public final static WebLocator SELECT_MONTH = new WebLocator("commit", ELocatorType.NAME, "SELECT_MONTH");//
//		public final static WebLocator SELECT_YEAR = new WebLocator("//a[@order_id='PLACE_HOLDER']", ELocatorType.XPATH, "SELECT_YEAR");//
//		public final static WebLocator FULL_NAME = new WebLocator("iTEXT", ELocatorType.ID, "FULL_NAME");
//		public final static WebLocator CVV = new WebLocator("iCVC", ELocatorType.ID, "CVV");
//		public final static WebLocator CONTINUE = new WebLocator("acs", ELocatorType.ID, "CONTINUE");
//	}
//
//	public static class ClientLocators extends GetTaxiLocators {
//		public final static WebLocator WELCOME = new WebLocator ("lbl_splash",ELocatorType.ID, "CLIENT:WELCOME_SCREEN");
//		public final static WebLocator CONF_CODE = new WebLocator ("txt_code",ELocatorType.ID, "CLIENT:CONF_CODE");
//		public final static WebLocator IL = new WebLocator ("//android.widget.TextView[@text='Israel']",ELocatorType.XPATH, "CLIENT:IL");
//		public final static WebLocator US = new WebLocator ("//android.widget.TextView[@text='United States']",ELocatorType.XPATH, "CLIENT:US");
//		public final static WebLocator UK = new WebLocator ("//android.widget.TextView[@text='United Kingdom']",ELocatorType.XPATH, "CLIENT:UK");
//		public final static WebLocator RU = new WebLocator ("//android.widget.TextView[@text='Russian Federation']",ELocatorType.XPATH, "CLIENT:RU");
//		public final static WebLocator BTN_CLOSE_FOR_TOUR = new WebLocator ("btn_left",ELocatorType.ID, "CLIENT:CLOSE_TOUR_BUTTON");
//		public final static WebLocator BTN_SKIP_TOUR = new WebLocator ("btn_left",ELocatorType.ID, "CLIENT:BTN_SKIP_TOUR");
//		public final static WebLocator TESTAPP_ENV_TXT = new WebLocator ("server",ELocatorType.ID, "CLIENT:ENV_TEXT");
//		public final static WebLocator TESTAPP_OK = new WebLocator ("launch",ELocatorType.ID, "CLIENT:ENV_OK");
//		public final static WebLocator CHOOSE_COUNTRY = new WebLocator ("country_group",ELocatorType.ID, "CLIENT:COUNTRY_NAME_BUTTON");
//		public final static WebLocator PHONE_NUMBER = new WebLocator ("txt_number",ELocatorType.ID, "CLIENT:EDIT_PHONE_NUMBER_BUTTON");
//		public final static WebLocator YES = new WebLocator ("btn_yes",ELocatorType.ID, "CLIENT:YES");
//		public final static WebLocator NO = new WebLocator ("btn_no",ELocatorType.ID, "CLIENT:NO");
//		public final static WebLocator BTN_ACCEPT = new WebLocator ("com.gettaxi.android:id/btn_accept",ELocatorType.ID, "CLIENT:BTN_ACCEPT");
//		public final static WebLocator ALLOW = new WebLocator ("permission_allow_button", ELocatorType.ID, "CLIENT:ALLOW");
//		public final static WebLocator LOCATE_ME = new WebLocator ("btn_locate", ELocatorType.ID, "CLIENT:LOCATE_ME");
//		public final static WebLocator REFERENCE_LIST_ITEM = new WebLocator ("txt_note",ELocatorType.ID, "CLIENT:REFERENCE_LIST_ITEM");
//		public final static WebLocator CHOOSE_REFERENCE = new WebLocator ("lbl_address_main",ELocatorType.ID, "CLIENT:CHOOSE_REFERENCE");
//		public final static WebLocator ORDER = new WebLocator ("btn_pick_address",ELocatorType.ID, "CLIENT:SET_PICKUP");
//		public final static WebLocator PICKUP_LINE_BTN = new WebLocator ("com.gettaxi.android:id/btn_line_selector",ELocatorType.ID, "CLIENT:PICKUP_LINE_BTN");
//		public final static WebLocator STREET_NUMBER_FIELD = new WebLocator ("com.gettaxi.android:id/txt_house",ELocatorType.ID, "CLIENT:STREET_NUMBER_FIELD");
//		public final static WebLocator HOUSING_FIELD = new WebLocator ("com.gettaxi.android:id/txt_housing",ELocatorType.ID, "CLIENT:HOUSING_FIELD");
//		public final static WebLocator BUILDING_FIELD = new WebLocator ("com.gettaxi.android:id/txt_building",ELocatorType.ID, "CLIENT:BUILDING_FIELD");
//		public final static WebLocator ENTRANCE_FIELD = new WebLocator ("com.gettaxi.android:id/txt_entrance",ELocatorType.ID, "CLIENT:ENTRANCE_FIELD");
//		public final static WebLocator DONE_BUTTON = new WebLocator ("menu_action",ELocatorType.ID, "CLIENT:DONE");
//		public final static WebLocator BTN_TOP_MENUE_DONE = new WebLocator ("menu_done",ELocatorType.ID, "CLIENT:DONE");
//
//		public final static WebLocator GENERIC_CLASS = new WebLocator ("//android.widget.TextView[translate(@text, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')='PLACEHOLDER']",ELocatorType.XPATH, "CLIENT:GENERIC_CLASS");
//		public final static WebLocator CLASSES_HEADER = new WebLocator ("divisions_tab_view_tab_container_id",ELocatorType.ID, "CLIENT:CLASSES_HEADER");
//		public final static WebLocator PICKUP_TIME = new WebLocator ("com.gettaxi.android:id/btn_pickup_time",ELocatorType.ID, "CLIENT:PICKUP_TIME");
//		public final static WebLocator FUTURE_RIDE_MINIMUM_TIME = new WebLocator ("//android.widget.TextView[contains(@text, 'Pickup Time')]",ELocatorType.XPATH, "CLIENT:FUTURE_RIDE_MINIMUM_TIME");
//		public final static WebLocator NOW = new WebLocator ("com.gettaxi.android:id/btn_no",ELocatorType.ID, "CLIENT:NOW");
//		public final static WebLocator SET = new WebLocator ("com.gettaxi.android:id/btn_yes",ELocatorType.ID, "CLIENT:SET");
//		public final static WebLocator CHOOSE_PRIVATE = new WebLocator ("//android.widget.TextView[@text='Private Ride']",ELocatorType.XPATH, "CLIENT:CHOOSE_PRIVATE");
//		public final static WebLocator CHOOSE_BUSINESS = new WebLocator ("//android.widget.TextView[@text='Business Ride']",ELocatorType.XPATH, "CLIENT:CHOOSE_BUSINESS");
//		public final static WebLocator DRIVER_NOTE_TEXT = new WebLocator ("txt_note",ELocatorType.ID, "CLIENT:DRIVER_NOTE_TEXT");
//		public final static WebLocator AWESOME_CLOSE = new WebLocator ("btn_clear_destination",ELocatorType.ID, "CLIENT:CLEAR_DESTINATION");
//		public final static WebLocator ADD_DESTINATION = new WebLocator ("dest_group",ELocatorType.ID, "CLIENT:ADD_DESTINATION");
//		public final static WebLocator SEARCH_ADDRESS = new WebLocator ("txt_search",ELocatorType.ID, "CLIENT:SEARCH_ADDRESS");
//		public final static WebLocator FIX_PRICE = new WebLocator ("lbl_price_fix",ELocatorType.ID, "CLIENT:FIX_PRICE");
//		public final static WebLocator TXT_ADDRESS_NOTES = new WebLocator ("txt_address_notes",ELocatorType.ID, "CLIENT:ADDRESS_NOTES");
//		public final static WebLocator LBL_PICKUP_ADDRESS_MAIN = new WebLocator ("lbl_pickup_row1",ELocatorType.ID, "CLIENT:PICKUP_ADDRESS");
//		public final static WebLocator LBL_PICKUP_ADDRESS_SECOND = new WebLocator ("lbl_address_second_raw_poi",ELocatorType.ID, "CLIENT:PICKUP_ADDRESS");
//		public final static WebLocator ADDRESS_ADDITIONAL_INFO_PAGER = new WebLocator ("address_additional_info_pager",ELocatorType.ID, "CLIENT:ADDRESS_ADDITIONAL_INFO_PAGER");
//
//		public final static WebLocator CARD_NUMBER = new WebLocator ("txt_cardNumber",ELocatorType.ID, "CLIENT:CARD_NUMBER");
//		public final static WebLocator CVV = new WebLocator ("txt_cvv",ELocatorType.ID, "CLIENT:CARD_CVV");
//		public final static WebLocator EMAIL = new WebLocator ("txt_email",ELocatorType.ID, "CLIENT:CARD_EMAIL");
//		public final static WebLocator CARD_MONTH_EXPIRATION = new WebLocator ("spn_month",ELocatorType.ID, "CLIENT:CARD_MONTH_EXPIRATION");
//		public final static WebLocator CARD_YEAR_EXPIRATION = new WebLocator ("spn_year",ELocatorType.ID, "CLIENT:CARD_YEAR_EXPIRATION");
//		public final static WebLocator TEXT_ITEM_IN_EXPIRATION_DATE = new WebLocator ("android:id/text1",ELocatorType.ID, "CLIENT:TEXT_ITEM_IN_EXPIRATION_DATE");
//		public final static WebLocator CARD_HOLDER_NAME = new WebLocator ("txt_holderName",ELocatorType.ID, "CLIENT:CARD_HOLDER_NAME");
//		public final static WebLocator BILLING_ZIP_CODE = new WebLocator ("txt_postal",ELocatorType.ID, "CLIENT:BILLING_ZIP_CODE");
//		public final static WebLocator BTN_CONFIRM = new WebLocator ("btn_confirm",ELocatorType.ID, "CLIENT:BTN_CONFIRM");
//		public final static WebLocator TIP_TITLE_IN_PAYMENT_SETTINGS = new WebLocator("tips_title",ELocatorType.ID, "CLIENT:TIP_TITLE_IN_PAYMENT_SETTINGS");
//		public final static WebLocator ZERO_TIP = new WebLocator("//android.widget.RadioButton[@text = '0%']",ELocatorType.XPATH, "CLIENT:ZERO_TIP");
//		public final static WebLocator TEN_TIP = new WebLocator("//android.widget.RadioButton[@text = '10%']",ELocatorType.XPATH, "CLIENT:TEN_TIP");
//		public final static WebLocator TWELVE_TIP = new WebLocator("//android.widget.RadioButton[@text = '12%']",ELocatorType.XPATH, "CLIENT:TWELVE_TIP");
//		public final static WebLocator FIFTEEN_TIP = new WebLocator("//android.widget.RadioButton[@text = '15%']",ELocatorType.XPATH, "CLIENT:FIFTEEN_TIP");
//
//		public final static WebLocator SUMMARY_TITLE = new WebLocator ("//android.widget.TextView[contains(@text,'ummary')]",ELocatorType.XPATH, "CLIENT:RIDE_SUMMARY_TITLE");
//		public final static WebLocator BTN_DONE_RIDE_SUMMARY = new WebLocator ("new_ride",ELocatorType.ID, "CLIENT:BTN_DONE_RIDE_SUMMARY");
//		public final static WebLocator DRIVER_RATE = new WebLocator ("rating_bar",ELocatorType.ID, "CLIENT:DRIVER_RATE");
//		public final static WebLocator SUMMARY_TABLE = new WebLocator ("//android.widget.TableLayout",ELocatorType.XPATH, "SUMMARY_TABLE");
//		public final static WebLocator SUMMARY_TABLE_CELL = new WebLocator ("//android.widget.TableRow/android.widget.TextView",ELocatorType.XPATH, "CLIENT:SUMMARY_TABLE_CELL");
//		public final static WebLocator SUMMARY_TABLE_TOTAL_CELL = new WebLocator (SUMMARY_TABLE_CELL.getLocator() + "[@text = 'Total']", ELocatorType.XPATH, "CLIENT:SUMMARY_TABLE_CELL");
//		public final static WebLocator EARN_FREE_CREDIT = new WebLocator ("com.gettaxi.android:id/earn_rides",ELocatorType.ID, "EARN_FREE_CREDIT");
//
//		// line buttons
//		public final static WebLocator CANCEL_RIDE_ON_ARRIVAL = new WebLocator ("com.gettaxi.android:id/menu_cancel", ELocatorType.ID, "CLIENT: CANCEL RIDE ON ARRIVAL");
//		public final static WebLocator BTN_YES = new WebLocator ("com.gettaxi.android:id/btn_yes", ELocatorType.ID, "CLIENT: BTN YES");
//
//		public final static WebLocator LINE_PAGER = new WebLocator ("com.gettaxi.android:id/page_layout",ELocatorType.ID, "CLIENT:LINE_PAGER");
//		public final static WebLocator LINE_PAGER_NAME_TXT = new WebLocator ("com.gettaxi.android:id/txt_line_title",ELocatorType.ID, "CLIENT:LINE_PAGER_NAME_TXT");
//		public final static WebLocator LINE_PICKUP_ADDRESS_MAIN_TXT = new WebLocator ("com.gettaxi.android:id/lbl_pickup_address_main",ELocatorType.ID, "CLIENT:LINE_PICKUP_ADDRESS_MAIN_TXT");
//		public final static WebLocator LINE_DROPOF_ADDRESS_MAIN_TXT = new WebLocator ("com.gettaxi.android:id/lbl_dest_address_main",ELocatorType.ID, "CLIENT:LINE_DROPOF_ADDRESS_MAIN_TXT");
//		public final static WebLocator LINE_BTN_SET_PICKUP = new WebLocator ("com.gettaxi.android:id/btn_set_pickup",ELocatorType.ID, "CLIENT:LINE_BTN_SET_PICKUP");// after we choose line and address we click on set pickup btn
//		public final static WebLocator LINE_BTN_SET_DROPOFF = new WebLocator ("com.gettaxi.android:id/btn_set_dropoff",ELocatorType.ID, "CLIENT:LINE_BTN_SET_DROPOFF");// after we choose line and pick up choose destination address and then click on btn_set_dropoff
//		public final static WebLocator ORDER_LINE = new WebLocator ("com.gettaxi.android:id/btn_confirm_order",ELocatorType.ID, "CLIENT:ORDER_LINE");// after we choose line and pick up btn_set_dropoff we click on order
//		public final static WebLocator LINE_CAPACITY = new WebLocator ("com.gettaxi.android:id/txt_tab_line_people",ELocatorType.ID, "CLIENT:LINE_CAPACITY");
//		public final static WebLocator LINE_CAPACITY_LIST = new WebLocator ("com.gettaxi.android:id/list",ELocatorType.ID, "CLIENT:LINE_CAPACITY_LIST");
//		public final static WebLocator LINE_CAPACITY_LIST_ITEM = new WebLocator ("com.gettaxi.android:id/txt_choice",ELocatorType.ID, "CLIENT:LINE_CAPACITY_LIST_ITEM");
//		public final static WebLocator LINE_CHOOSE_PAYMENT = new WebLocator ("com.gettaxi.android:id/payment_tab",ELocatorType.ID, "CLIENT:LINE_CHOOSE_PAYMENT");// chhose payment in line
//		public final static WebLocator CREDIT_CARD = new WebLocator ("//android.widget.TextView[@text='PLACE_HOLDER']",ELocatorType.XPATH, "CLIENT:PAYMENT_TYPE_CASH");
//		public final static WebLocator LINE_IMG_ME_ON_MAP = new WebLocator ("com.gettaxi.android:id/img_me",ELocatorType.ID, "CLIENT:LINE_IMG_ME_ON_MAP");
//		public final static WebLocator TEXT_ITEM_IN_PAYMENT_LIST = new WebLocator ("com.gettaxi.android:id/text",ELocatorType.ID, "CLIENT:TEXT_ITEM_IN_PAYMENT_LIST");
//		public final static WebLocator CREDIT_CARD_LIST_ITEM = new WebLocator ("com.gettaxi.android:id/text",ELocatorType.ID, "CLIENT:CREDIT_CARD_LIST_ITEM");
//		public final static WebLocator CREDIT_CARD_VALIDATION = new WebLocator ("com.gettaxi.android:id/verifyCreditCardCode",ELocatorType.ID, "CLIENT:CREDIT_CARD_VERIFY");
//		public final static WebLocator BTN_CREATE_NEW_ACCOUNT = new WebLocator ("com.gettaxi.android:id/pairAccountWipeAccount",ELocatorType.ID, "CLIENT:CREATE_NEW_ACCOUNT");
//		public final static WebLocator HISTORY = new WebLocator ("//android.widget.CheckedTextView[@text='History']",ELocatorType.XPATH, "CLIENT:History");
//		public final static WebLocator CREDIT_DELETE = new WebLocator ("com.gettaxi.android:id/img_delete",ELocatorType.ID, "CLIENT:CREDIT_DELETE");
//		public final static WebLocator THIS_IS_MT_ACCOUNT_TXT = new WebLocator("//android.widget.TextView[contains(@text, 'This is my account')]",ELocatorType.XPATH, "CLIENT:THIS_IS_MY_ACCOUNT");
//		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		public final static WebLocator LINE_TXT_PICKUP_TITLE = new WebLocator ("com.gettaxi.android:id/txt_pickup_title",ELocatorType.ID, "CLIENT:LINE_TXT_PICKUP_TITLE");
//		public final static WebLocator LINE_TXT_PICKUP_INFO = new WebLocator ("com.gettaxi.android:id/txt_pickup_info",ELocatorType.ID, "CLIENT:LINE_TXT_PICKUP_INFO");
//		public final static WebLocator LINE_TXT_PICKUP_ETA = new WebLocator ("com.gettaxi.android:id/txt_pickup_eta",ELocatorType.ID, "CLIENT:LINE_TXT_PICKUP_ETA");
//		public final static WebLocator LINE_TXT_DESTINATION_TITLE = new WebLocator ("com.gettaxi.android:id/txt_destination_title",ELocatorType.ID, "CLIENT:LINE_TXT_DESTINATION_TITLE");
//		public final static WebLocator LINE_TXT_DESTINATION_INFO = new WebLocator ("com.gettaxi.android:id/txt_destination_info",ELocatorType.ID, "CLIENT:LINE_TXT_DESTINATION_INFO");
//		public final static WebLocator LINE_TXT_PRICE_INFO = new WebLocator ("com.gettaxi.android:id/txt_tab_line_price_info",ELocatorType.ID, "CLIENT:LINE_TXT_PRICE_INFO");
//		public final static WebLocator LINE_TXT_PAYMENT = new WebLocator ("com.gettaxi.android:id/txt_tab_line_payment",ELocatorType.ID, "CLIENT:LINE_TXT_PAYMENT");
//		public final static WebLocator USE_COUPON = new WebLocator ("com.gettaxi.android:id/btn_coupon",ELocatorType.ID, "CLIENT:USE_COUPON");
//		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		// in case it's line class :
//		public final static WebLocator PAYMENT_TYPE = new WebLocator ("btn_payment_type",ELocatorType.ID, "CLIENT:PAYMENT_TYPE");
//		public final static WebLocator CASH = new WebLocator ("//android.widget.TextView[@text='Cash']",ELocatorType.XPATH, "CLIENT:PAYMENT_TYPE_CASH");
//		public final static WebLocator CANCEL = new WebLocator ("menu_cancel",ELocatorType.ID, "CLIENT:CANCEL");
//		public final static WebLocator OK = new WebLocator ("btn_no",ELocatorType.ID, "CLIENT:SET");
//		public final static WebLocator NEXT = new WebLocator ("btn_send",ELocatorType.ID, "CLIENT:SEND");
//		public final static WebLocator NOTE_TO_DRIVER = new WebLocator("com.gettaxi.android:id/txt_message",ELocatorType.ID, "CLIENT:NOTE_TO_DRIVER");
//
//		public final static WebLocator TABLE = new WebLocator ("//android.widget.ListView",ELocatorType.XPATH, "CLIENT:TABLE");
//		public final static WebLocator TABLE_CELL = new WebLocator ("//android.widget.ListView//android.widget.TextView",ELocatorType.XPATH, "CLIENT:TABLE CELL");
//		public final static WebLocator DESTINATION_TABLE_CELL = new WebLocator ("selectable",ELocatorType.ID, "CLIENT:DESTINATION_TABLE_CELL");
//
//		// submit buttons locators
//		public final static WebLocator OK_CAR_CLASS = new WebLocator ("btn_order",ELocatorType.ID, "CLIENT:OK_CAR_CLASS");
//
//		public final static WebLocator MENU_BUTTON = new WebLocator ("//android.widget.ImageButton[@content-desc='Gett']",ELocatorType.XPATH, "CLIENT:MAIN_MENU");
//		public final static WebLocator BACK_BUTTON = new WebLocator ("//android.widget.ImageButton[@content-desc='Navigate up']",ELocatorType.XPATH, "CLIENT:BACK");
////		public final static WebLocator NAVIGATE_UP = new WebLocator ("//android.widget.ImageButton[@content-desc='Navigate up']",ELocatorType.XPATH, "CLIENT:Navigate up");
//		public final static WebLocator COUPON_CODE_BUTTON = new WebLocator ("//android.widget.CheckedTextView[@resource-id='com.gettaxi.android:id/design_menu_item_text'][contains(@text, 'Coupon')]",ELocatorType.XPATH, "CLIENT:COUPON_CODE");
//		public final static WebLocator PAYMENTS = new WebLocator ("//android.widget.CheckedTextView[@resource-id='com.gettaxi.android:id/design_menu_item_text'][contains(@text, 'Payment')]",ELocatorType.XPATH, "CLIENT:PAYMENT_SETTINGS");
//		public final static WebLocator ADD_CREDIT_CARD = new WebLocator ("//android.widget.CheckedTextView[@resource-id='com.gettaxi.android:id/design_menu_item_text'][contains(@text, 'Add a')]",ELocatorType.XPATH, "CLIENT:ADD_A_CREDIT_CARD");
//		public final static WebLocator ADD_CARD_BUTTON = new WebLocator ("//android.widget.LinearLayout[@resource-id='com.gettaxi.android:id/credit_card_group']//android.widget.ImageView[@resource-id='com.gettaxi.android:id/imgIcon']",ELocatorType.XPATH, "CLIENT:ADD_A_CREDIT_CARD");
//		public final static WebLocator TEXT_CODE = new WebLocator ("txt_coupon",ELocatorType.ID, "CLIENT:TEXT_CODE");
//		public final static WebLocator CLOSE_COUPON = new WebLocator ("com.gettaxi.android:id/img_close",ELocatorType.ID, "CLIENT:CLOSE_COUPON");
//		public final static WebLocator TITLE = new WebLocator ("lbl_title",ELocatorType.ID, "CLIENT:TITLE");
//		public final static WebLocator BALANCE_CELL_MAINSCREEN = new WebLocator ("balance_amount",ELocatorType.ID, "CLIENT:BALANCE_CELL_MAINSCREEN");
//
//		public final static WebLocator MY_PROFILE = new WebLocator ("com.gettaxi.android:id/group_profile",ELocatorType.ID, "CLIENT:MY_PROFLILE");
//		public final static WebLocator MY_PROFILE_PHONE = new WebLocator ("com.gettaxi.android:id/txt_phone",ELocatorType.ID, "CLIENT:MY_PROFILE_PHONE");
//
//		public final static WebLocator DRIVER_RATE_NEW = new WebLocator("com.gettaxi.android:id/driver_raitingText",ELocatorType.ID, "CLIENT:DRIVER_RATE_NEW");
//		public final static WebLocator DRIVER_RATEING = new WebLocator("com.gettaxi.android:id/driver_raiting",ELocatorType.ID, "CLIENT:DRIVER_RATEING");
//		// company business user with policy
////		reason of travel :
//		public final static WebLocator REASON_TRAVLE_CHOOSE = new WebLocator("//android.widget.TextView[contains(@text, 'Reason for travel')]", ELocatorType.XPATH, "CLIENT:REASON_TRAVLE_CHOOSE");
//		public final static WebLocator REASON_TRAVLE_CHOOSE_LIST_ITEM = new WebLocator("text",ELocatorType.ID, "CLIENT:REASON_TRAVLE_CHOOSE_LIST_ITEM");
//		//lbl_address_secondary
//
//		public final static WebLocator ADD_ADDITIONAL_CARD = new WebLocator ("//android.widget.TextView[@text='Add Credit Card']",ELocatorType.XPATH, "CLIENT:ADD_ADDITIONAL_CARD");
//		public final static WebLocator ADD_CREDIT_CARD_ORDER_SCREEN = new WebLocator("com.gettaxi.android:id/btn_add_card",ELocatorType.ID, "CLIENT:Add Credit Card");
//		public final static WebLocator ADDRESS_SUGGESTION = new WebLocator("com.gettaxi.android:id/data" ,ELocatorType.ID ,"CLIENT:ADDRESS_SUGGESTION" );
//		public final static WebLocator ADD_CARD_PAYMENT_SETTINGS_ORDER_SCREEN = new WebLocator ("//android.widget.TextView[@text='Add Card']",ELocatorType.XPATH, "CLIENT:ADD_CARD_PAYMENT_SETTINGS_ORDER_SCREEN");
//
//
//
//	}
//
//
//}
