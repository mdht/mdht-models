/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.vsdr.*;
import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance;
import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults;
import org.openhealthtools.mdht.uml.cda.vsdr.CertifyingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.CoronerCaseTransfer;
import org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral;
import org.openhealthtools.mdht.uml.cda.vsdr.DateandTimeofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody;
import org.openhealthtools.mdht.uml.cda.vsdr.Injury;
import org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus;
import org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords;
import org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VsdrFactoryImpl extends EFactoryImpl implements VsdrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VsdrFactory init() {
		try {
			VsdrFactory theVsdrFactory = (VsdrFactory)EPackage.Registry.INSTANCE.getEFactory(VsdrPackage.eNS_URI);
			if (theVsdrFactory != null) {
				return theVsdrFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VsdrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VsdrFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VsdrPackage.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS: return createReportingDeathInformationfromaClinicalSettingtoVitalRecords();
			case VsdrPackage.DEATH_REPORT_DOCUMENT_BODY: return createDeathReportDocumentBody();
			case VsdrPackage.DATEAND_TIMEOF_DEATH: return createDateandTimeofDeath();
			case VsdrPackage.LOCATIONOF_DEATH: return createLocationofDeath();
			case VsdrPackage.CERTIFYING_DEATH: return createCertifyingDeath();
			case VsdrPackage.MANNEROF_DEATH: return createMannerofDeath();
			case VsdrPackage.PREGNANCY_STATUS: return createPregnancyStatus();
			case VsdrPackage.TOBACCO_USE: return createTobaccoUse();
			case VsdrPackage.INJURY: return createInjury();
			case VsdrPackage.DEATH_CAUSAL_INFORMATION: return createDeathCausalInformation();
			case VsdrPackage.AUTOPSY_PERFORMANCE: return createAutopsyPerformance();
			case VsdrPackage.AUTOPSY_RESULTS: return createAutopsyResults();
			case VsdrPackage.CORONER_REFERRAL: return createCoronerReferral();
			case VsdrPackage.CORONER_CASE_TRANSFER: return createCoronerCaseTransfer();
			case VsdrPackage.DEATH_LOCATION_TYPE: return createDeathLocationType();
			case VsdrPackage.PRONOUNCING_DEATH: return createPronouncingDeath();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReportingDeathInformationfromaClinicalSettingtoVitalRecords createReportingDeathInformationfromaClinicalSettingtoVitalRecords() {
		ReportingDeathInformationfromaClinicalSettingtoVitalRecordsImpl reportingDeathInformationfromaClinicalSettingtoVitalRecords = new ReportingDeathInformationfromaClinicalSettingtoVitalRecordsImpl();
		return reportingDeathInformationfromaClinicalSettingtoVitalRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeathReportDocumentBody createDeathReportDocumentBody() {
		DeathReportDocumentBodyImpl deathReportDocumentBody = new DeathReportDocumentBodyImpl();
		return deathReportDocumentBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateandTimeofDeath createDateandTimeofDeath() {
		DateandTimeofDeathImpl dateandTimeofDeath = new DateandTimeofDeathImpl();
		return dateandTimeofDeath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationofDeath createLocationofDeath() {
		LocationofDeathImpl locationofDeath = new LocationofDeathImpl();
		return locationofDeath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CertifyingDeath createCertifyingDeath() {
		CertifyingDeathImpl certifyingDeath = new CertifyingDeathImpl();
		return certifyingDeath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MannerofDeath createMannerofDeath() {
		MannerofDeathImpl mannerofDeath = new MannerofDeathImpl();
		return mannerofDeath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PregnancyStatus createPregnancyStatus() {
		PregnancyStatusImpl pregnancyStatus = new PregnancyStatusImpl();
		return pregnancyStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TobaccoUse createTobaccoUse() {
		TobaccoUseImpl tobaccoUse = new TobaccoUseImpl();
		return tobaccoUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Injury createInjury() {
		InjuryImpl injury = new InjuryImpl();
		return injury;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeathCausalInformation createDeathCausalInformation() {
		DeathCausalInformationImpl deathCausalInformation = new DeathCausalInformationImpl();
		return deathCausalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AutopsyPerformance createAutopsyPerformance() {
		AutopsyPerformanceImpl autopsyPerformance = new AutopsyPerformanceImpl();
		return autopsyPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AutopsyResults createAutopsyResults() {
		AutopsyResultsImpl autopsyResults = new AutopsyResultsImpl();
		return autopsyResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoronerReferral createCoronerReferral() {
		CoronerReferralImpl coronerReferral = new CoronerReferralImpl();
		return coronerReferral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoronerCaseTransfer createCoronerCaseTransfer() {
		CoronerCaseTransferImpl coronerCaseTransfer = new CoronerCaseTransferImpl();
		return coronerCaseTransfer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeathLocationType createDeathLocationType() {
		DeathLocationTypeImpl deathLocationType = new DeathLocationTypeImpl();
		return deathLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PronouncingDeath createPronouncingDeath() {
		PronouncingDeathImpl pronouncingDeath = new PronouncingDeathImpl();
		return pronouncingDeath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VsdrPackage getVsdrPackage() {
		return (VsdrPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VsdrPackage getPackage() {
		return VsdrPackage.eINSTANCE;
	}

} //VsdrFactoryImpl
