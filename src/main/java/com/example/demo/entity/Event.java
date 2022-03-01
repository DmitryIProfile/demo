package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "event")
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "createdBy", nullable = false)
    private String createdBy;

    @Column(name = "createdDate", nullable = false)
    private Date createdDate;

    @Column(name = "lastModifiedBy")
    private String lastModifiedBy;

    @Column(name = "lastModifiedDate")
    private Date lastModifiedDate;

    @Column(name = "details")
    private String details;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "eventCategory_id")
    private Long eventcategoryId;

    @Column(name = "eventGenre_id")
    private Long eventgenreId;

    @Column(name = "organizerProfile_id")
    private Long organizerprofileId;

    @Column(name = "status")
    private String status;

    @Column(name = "publishDate")
    private Date publishDate;

    @Column(name = "publishedBy")
    private String publishedBy;

    @Column(name = "shortDescription")
    private String shortDescription;

    @Column(name = "ticketsCurrency")
    private String ticketsCurrency;

    @Column(name = "bookingStrategy")
    private String bookingStrategy;

    @Column(name = "publicId", nullable = false)
    private String publicId;

    @Column(name = "bookingDuration")
    private Long bookingDuration;

    @Column(name = "approveDate")
    private Date approveDate;

    @Column(name = "approved")
    private Boolean approved;

    @Column(name = "approvedBy")
    private String approvedBy;

    @Column(name = "ticketTemplateId")
    private Long ticketTemplateId;

    @Column(name = "eventId")
    private Long eventId;

    @Column(name = "link")
    private String link;

    @Column(name = "share")
    private Boolean share;

    @Column(name = "numberingEnabled")
    private Boolean numberingEnabled;

    @Column(name = "follow")
    private String follow;

    @Column(name = "closeOnlineBooking")
    private Date closeOnlineBooking;

    @Column(name = "openOnlineBooking")
    private Date openOnlineBooking;

    @Column(name = "emailTemplateID")
    private Long emailTemplateID;

    @Column(name = "city")
    private String city;

    @Column(name = "contactEmail")
    private String contactEmail;

    @Column(name = "contactPersonName")
    private String contactPersonName;

    @Column(name = "contactPhone")
    private String contactPhone;

    @Column(name = "contactUrl")
    private String contactUrl;

    @Column(name = "boxofficeEnable")
    private Integer boxofficeEnable;

    @Column(name = "cardMode")
    private Integer cardMode;

    @Column(name = "cashMode")
    private Integer cashMode;

    @Column(name = "paymentGateway")
    private String paymentGateway;

    @Column(name = "timeZone")
    private String timeZone;

    @Column(name = "campaignId")
    private String campaignId;

    @Column(name = "myCharityEnabled")
    private Boolean myCharityEnabled;

    @Column(name = "hideOnlineBookingDates")
    private Boolean hideOnlineBookingDates;

    @Column(name = "hideTicketFees")
    private Boolean hideTicketFees;

    @Column(name = "serviceFee")
    private BigDecimal serviceFee;

    @Column(name = "myCharityRequired")
    private Boolean myCharityRequired;

    @Column(name = "myCharitySelectionLimit")
    private Long myCharitySelectionLimit;

    @Column(name = "isRestrictedAccessEnabled")
    private Boolean isRestrictedAccessEnabled;

    @Column(name = "hideCrosspromotion")
    private Boolean hideCrosspromotion;

    @Column(name = "fixedServiceFee")
    private BigDecimal fixedServiceFee;

    @Column(name = "gaTrackingCode")
    private String gaTrackingCode;

    @Column(name = "refundsEnabled")
    private Boolean refundsEnabled;

    @Column(name = "additionalPaymentExpireHours")
    private Integer additionalPaymentExpireHours;

    @Column(name = "archiveDate")
    private Date archiveDate;

    @Column(name = "myCharityAuto")
    private Boolean myCharityAuto;

    @Column(name = "printTemplateID")
    private Long printTemplateID;

    @Column(name = "isRestrictedAccessByTicketTypeEnabled")
    private Boolean isRestrictedAccessByTicketTypeEnabled;

    @Column(name = "stadiumId")
    private Long stadiumId;

    @Column(name = "hideETickets")
    private Boolean hideETickets;

    @Column(name = "bccEmailAddress")
    private String bccEmailAddress;

    @Column(name = "hideTimeslotDate")
    private Boolean hideTimeslotDate;

    @Column(name = "displayQuantityAsCheckbox")
    private Boolean displayQuantityAsCheckbox;

    @Column(name = "contactEmail2")
    private String contactEmail2;

    @Column(name = "contactPersonName2")
    private String contactPersonName2;

    @Column(name = "contactPhone2")
    private String contactPhone2;

    @Column(name = "contactUrl2")
    private String contactUrl2;

    @Column(name = "eeVersion")
    private Long eeVersion;

    @Column(name = "eventAreaCode")
    private String eventAreaCode;

    @Column(name = "eventCountry")
    private String eventCountry;

    @Column(name = "eventCounty")
    private String eventCounty;

    @Column(name = "ticketTypesAsRadio")
    private Boolean ticketTypesAsRadio;

    @Column(name = "restrictedExpireDate")
    private Date restrictedExpireDate;

    @Column(name = "enableBreakdownByEventDates")
    private Boolean enableBreakdownByEventDates;

    @Column(name = "enableBreakdownBySaleMode")
    private Boolean enableBreakdownBySaleMode;

    @Column(name = "enableBreakdownByTicketTypesAndGroups")
    private Boolean enableBreakdownByTicketTypesAndGroups;

    @Column(name = "enableGroupsInsteadTicketTypes")
    private Boolean enableGroupsInsteadTicketTypes;

    @Column(name = "seasonTicketsEnabled")
    private Boolean seasonTicketsEnabled;

    @Column(name = "separateTicketLinksInEmail")
    private Boolean separateTicketLinksInEmail;

    @Column(name = "showOnWhatsOnPage")
    private Boolean showOnWhatsOnPage;

    @Column(name = "showOnWhatsOnPageForCategory")
    private Boolean showOnWhatsOnPageForCategory;

    @Column(name = "myCharityHeaderText")
    private String myCharityHeaderText;

    @Column(name = "myCharityYesNoDropdown")
    private Boolean myCharityYesNoDropdown;

    @Column(name = "legacyMobileApiFieldCode")
    private String legacyMobileApiFieldCode;

    @Column(name = "legacyMobileApiMerchandiseId")
    private Long legacyMobileApiMerchandiseId;

    @Column(name = "marketingSectionDescription")
    private String marketingSectionDescription;

    @Column(name = "marketingSectionImage")
    private String marketingSectionImage;

    @Column(name = "allowEditingPersonDataInMMB")
    private Boolean allowEditingPersonDataInMMB;

    @Column(name = "hideMarketingSection")
    private Boolean hideMarketingSection;

    @Column(name = "hideMarketingSectionDate")
    private Date hideMarketingSectionDate;

    @Column(name = "instagramLink")
    private String instagramLink;

    @Column(name = "customNotificationText")
    private String customNotificationText;

    @Column(name = "newCustomEmailTemplate")
    private Boolean newCustomEmailTemplate;

    @Column(name = "feeType")
    private String feeType;

    @Column(name = "merchandiseFeeType")
    private String merchandiseFeeType;

    @Column(name = "enableMMBTicketCancelation")
    private Boolean enableMMBTicketCancelation;

    @Column(name = "mmbTicketRefundPercentage")
    private BigDecimal mmbTicketRefundPercentage;

    @Column(name = "mmbPurchaseRefundPercentage")
    private BigDecimal mmbPurchaseRefundPercentage;

    @Column(name = "checkAAIEnabled")
    private Boolean checkAAIEnabled;

    @Column(name = "membershipHeaderText")
    private String membershipHeaderText;

    @Column(name = "typeCheckAAI")
    private String typeCheckAAI;

    @Column(name = "debsAccessCode")
    private String debsAccessCode;

    @Column(name = "showTimeslotsCalendar")
    private Boolean showTimeslotsCalendar;

    @Column(name = "marketingSectionImageLink")
    private String marketingSectionImageLink;

    @Column(name = "justGivingCharityId")
    private String justGivingCharityId;

    @Column(name = "justGivingEventId")
    private String justGivingEventId;

    @Column(name = "justGivingIntegrationEnabled")
    private Boolean justGivingIntegrationEnabled;

    @Column(name = "justGivingCharityName")
    private String justGivingCharityName;

    @Column(name = "sellOnlineUntilEndDate")
    private Boolean sellOnlineUntilEndDate;

    @Column(name = "purchasesOnlyFirstTicket")
    private Boolean purchasesOnlyFirstTicket;

    @Column(name = "purchasesSeparatePage")
    private Boolean purchasesSeparatePage;

    @Column(name = "enableChangingTicketTypesInMMB")
    private Boolean enableChangingTicketTypesInMMB;

    @Column(name = "enableTicketTransfer")
    private Boolean enableTicketTransfer;

    @Column(name = "enableRiceTimeUpload")
    private Boolean enableRiceTimeUpload;

    @Column(name = "closeRaceTimeSubmit")
    private Date closeRaceTimeSubmit;

    @Column(name = "openRaceTimeSubmit")
    private Date openRaceTimeSubmit;

    @Column(name = "closeDateRefund")
    private Date closeDateRefund;

    @Column(name = "openDateRefund")
    private Date openDateRefund;

    @Column(name = "enableCheckIn")
    private Boolean enableCheckIn;

    @Column(name = "enableCheckInEmailReminder")
    private Boolean enableCheckInEmailReminder;

    @Column(name = "ci_Leisure")
    private Boolean ciLeisure;

    @Column(name = "organizerOverride")
    private Boolean organizerOverride;

    @Column(name = "isRestrictedAccessToSelectedTicketType")
    private Boolean isRestrictedAccessToSelectedTicketType;

    @Column(name = "fundraisingCampaignUuid")
    private String fundraisingCampaignUuid;

    @Column(name = "membershipCourseEventUuid")
    private String membershipCourseEventUuid;

    @Column(name = "membershipCourseMembershipRequired")
    private Boolean membershipCourseMembershipRequired;

    @Column(name = "aaiPermitUuid")
    private String aaiPermitUuid;

    @Column(name = "facebookPixelId")
    private String facebookPixelId;

}
