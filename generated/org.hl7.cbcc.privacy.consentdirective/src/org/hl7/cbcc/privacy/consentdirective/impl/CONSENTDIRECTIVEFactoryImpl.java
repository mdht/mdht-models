/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEFactory;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.ComputablePolicyConsent;
import org.hl7.cbcc.privacy.consentdirective.ConfidentialitySecurityObservation;
import org.hl7.cbcc.privacy.consentdirective.ConsentAction;
import org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry;
import org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition;
import org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition;
import org.hl7.cbcc.privacy.consentdirective.CriteriumRelatedProtectedProblem;
import org.hl7.cbcc.privacy.consentdirective.IIHIReceivingProvider;
import org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer;
import org.hl7.cbcc.privacy.consentdirective.ObligationPolicySecurityObservation;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDetailsSection;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderAuthor;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderDocumentationOf;
import org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderDocumentationOfServiceEvent;
import org.hl7.cbcc.privacy.consentdirective.PurposeOfUseSecurityObservation;
import org.hl7.cbcc.privacy.consentdirective.RefrainPolicySecurityObservation;
import org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsent;
import org.hl7.cbcc.privacy.consentdirective.SignatureImageEntry;
import org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation;
import org.hl7.cbcc.privacy.consentdirective.SignaturesSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CONSENTDIRECTIVEFactoryImpl extends EFactoryImpl implements CONSENTDIRECTIVEFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CONSENTDIRECTIVEFactory init() {
		try {
			CONSENTDIRECTIVEFactory theCONSENTDIRECTIVEFactory = (CONSENTDIRECTIVEFactory) EPackage.Registry.INSTANCE.getEFactory(
				CONSENTDIRECTIVEPackage.eNS_URI);
			if (theCONSENTDIRECTIVEFactory != null) {
				return theCONSENTDIRECTIVEFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CONSENTDIRECTIVEFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSENTDIRECTIVEFactoryImpl() {
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
			case CONSENTDIRECTIVEPackage.PRIVACY_CONSENT_HEADER_AUTHOR:
				return createPrivacyConsentHeaderAuthor();
			case CONSENTDIRECTIVEPackage.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT:
				return createPrivacyConsentHeaderDocumentationOfServiceEvent();
			case CONSENTDIRECTIVEPackage.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT:
				return createPrivacyConsentDirectiveDocument();
			case CONSENTDIRECTIVEPackage.PRIVACY_CONSENT_DETAILS_SECTION:
				return createPrivacyConsentDetailsSection();
			case CONSENTDIRECTIVEPackage.SIGNATURES_SECTION:
				return createSignaturesSection();
			case CONSENTDIRECTIVEPackage.CONSENT_DIRECTIVE_ENTRY:
				return createConsentDirectiveEntry();
			case CONSENTDIRECTIVEPackage.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION:
				return createConsentDirectiveStructuredDefinition();
			case CONSENTDIRECTIVEPackage.CONSENT_ACTION:
				return createConsentAction();
			case CONSENTDIRECTIVEPackage.INFORMATION_CRITERIA_REFERENCES_ORGANIZER:
				return createInformationCriteriaReferencesOrganizer();
			case CONSENTDIRECTIVEPackage.CRITERIUM_INFORMATION_DEFINITION:
				return createCriteriumInformationDefinition();
			case CONSENTDIRECTIVEPackage.CRITERIUM_RELATED_PROTECTED_PROBLEM:
				return createCriteriumRelatedProtectedProblem();
			case CONSENTDIRECTIVEPackage.CONFIDENTIALITY_SECURITY_OBSERVATION:
				return createConfidentialitySecurityObservation();
			case CONSENTDIRECTIVEPackage.IIHI_RECEIVING_PROVIDER:
				return createIIHIReceivingProvider();
			case CONSENTDIRECTIVEPackage.OBLIGATION_POLICY_SECURITY_OBSERVATION:
				return createObligationPolicySecurityObservation();
			case CONSENTDIRECTIVEPackage.COMPUTABLE_POLICY_CONSENT:
				return createComputablePolicyConsent();
			case CONSENTDIRECTIVEPackage.SCANNED_PRIVACY_CONSENT:
				return createScannedPrivacyConsent();
			case CONSENTDIRECTIVEPackage.SIGNATURE_IMAGE_OBSERVATION:
				return createSignatureImageObservation();
			case CONSENTDIRECTIVEPackage.SIGNATURE_IMAGE_ENTRY:
				return createSignatureImageEntry();
			case CONSENTDIRECTIVEPackage.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF:
				return createPrivacyConsentHeaderDocumentationOf();
			case CONSENTDIRECTIVEPackage.PURPOSE_OF_USE_SECURITY_OBSERVATION:
				return createPurposeOfUseSecurityObservation();
			case CONSENTDIRECTIVEPackage.REFRAIN_POLICY_SECURITY_OBSERVATION:
				return createRefrainPolicySecurityObservation();
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
	public PrivacyConsentHeaderAuthor createPrivacyConsentHeaderAuthor() {
		PrivacyConsentHeaderAuthorImpl privacyConsentHeaderAuthor = new PrivacyConsentHeaderAuthorImpl();
		return privacyConsentHeaderAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivacyConsentHeaderDocumentationOfServiceEvent createPrivacyConsentHeaderDocumentationOfServiceEvent() {
		PrivacyConsentHeaderDocumentationOfServiceEventImpl privacyConsentHeaderDocumentationOfServiceEvent = new PrivacyConsentHeaderDocumentationOfServiceEventImpl();
		return privacyConsentHeaderDocumentationOfServiceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivacyConsentDirectiveDocument createPrivacyConsentDirectiveDocument() {
		PrivacyConsentDirectiveDocumentImpl privacyConsentDirectiveDocument = new PrivacyConsentDirectiveDocumentImpl();
		return privacyConsentDirectiveDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivacyConsentDetailsSection createPrivacyConsentDetailsSection() {
		PrivacyConsentDetailsSectionImpl privacyConsentDetailsSection = new PrivacyConsentDetailsSectionImpl();
		return privacyConsentDetailsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentDirectiveEntry createConsentDirectiveEntry() {
		ConsentDirectiveEntryImpl consentDirectiveEntry = new ConsentDirectiveEntryImpl();
		return consentDirectiveEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignaturesSection createSignaturesSection() {
		SignaturesSectionImpl signaturesSection = new SignaturesSectionImpl();
		return signaturesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignatureImageEntry createSignatureImageEntry() {
		SignatureImageEntryImpl signatureImageEntry = new SignatureImageEntryImpl();
		return signatureImageEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentDirectiveStructuredDefinition createConsentDirectiveStructuredDefinition() {
		ConsentDirectiveStructuredDefinitionImpl consentDirectiveStructuredDefinition = new ConsentDirectiveStructuredDefinitionImpl();
		return consentDirectiveStructuredDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentAction createConsentAction() {
		ConsentActionImpl consentAction = new ConsentActionImpl();
		return consentAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InformationCriteriaReferencesOrganizer createInformationCriteriaReferencesOrganizer() {
		InformationCriteriaReferencesOrganizerImpl informationCriteriaReferencesOrganizer = new InformationCriteriaReferencesOrganizerImpl();
		return informationCriteriaReferencesOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CriteriumInformationDefinition createCriteriumInformationDefinition() {
		CriteriumInformationDefinitionImpl criteriumInformationDefinition = new CriteriumInformationDefinitionImpl();
		return criteriumInformationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CriteriumRelatedProtectedProblem createCriteriumRelatedProtectedProblem() {
		CriteriumRelatedProtectedProblemImpl criteriumRelatedProtectedProblem = new CriteriumRelatedProtectedProblemImpl();
		return criteriumRelatedProtectedProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidentialitySecurityObservation createConfidentialitySecurityObservation() {
		ConfidentialitySecurityObservationImpl confidentialitySecurityObservation = new ConfidentialitySecurityObservationImpl();
		return confidentialitySecurityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IIHIReceivingProvider createIIHIReceivingProvider() {
		IIHIReceivingProviderImpl iihiReceivingProvider = new IIHIReceivingProviderImpl();
		return iihiReceivingProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObligationPolicySecurityObservation createObligationPolicySecurityObservation() {
		ObligationPolicySecurityObservationImpl obligationPolicySecurityObservation = new ObligationPolicySecurityObservationImpl();
		return obligationPolicySecurityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputablePolicyConsent createComputablePolicyConsent() {
		ComputablePolicyConsentImpl computablePolicyConsent = new ComputablePolicyConsentImpl();
		return computablePolicyConsent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScannedPrivacyConsent createScannedPrivacyConsent() {
		ScannedPrivacyConsentImpl scannedPrivacyConsent = new ScannedPrivacyConsentImpl();
		return scannedPrivacyConsent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignatureImageObservation createSignatureImageObservation() {
		SignatureImageObservationImpl signatureImageObservation = new SignatureImageObservationImpl();
		return signatureImageObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivacyConsentHeaderDocumentationOf createPrivacyConsentHeaderDocumentationOf() {
		PrivacyConsentHeaderDocumentationOfImpl privacyConsentHeaderDocumentationOf = new PrivacyConsentHeaderDocumentationOfImpl();
		return privacyConsentHeaderDocumentationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PurposeOfUseSecurityObservation createPurposeOfUseSecurityObservation() {
		PurposeOfUseSecurityObservationImpl purposeOfUseSecurityObservation = new PurposeOfUseSecurityObservationImpl();
		return purposeOfUseSecurityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefrainPolicySecurityObservation createRefrainPolicySecurityObservation() {
		RefrainPolicySecurityObservationImpl refrainPolicySecurityObservation = new RefrainPolicySecurityObservationImpl();
		return refrainPolicySecurityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CONSENTDIRECTIVEPackage getCONSENTDIRECTIVEPackage() {
		return (CONSENTDIRECTIVEPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CONSENTDIRECTIVEPackage getPackage() {
		return CONSENTDIRECTIVEPackage.eINSTANCE;
	}

} // CONSENTDIRECTIVEFactoryImpl
