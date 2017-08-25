/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.CDAPackage;
import org.eclipse.mdht.uml.cda.util.AnnotationBasedInitializer;
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
import org.hl7.cbcc.privacy.consentdirective.SecurityLabel;
import org.hl7.cbcc.privacy.consentdirective.SecurityObservation;
import org.hl7.cbcc.privacy.consentdirective.SignatureImageEntry;
import org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation;
import org.hl7.cbcc.privacy.consentdirective.SignaturesSection;
import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CONSENTDIRECTIVEPackageImpl extends EPackageImpl implements CONSENTDIRECTIVEPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privacyConsentHeaderAuthorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privacyConsentHeaderDocumentationOfServiceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privacyConsentDirectiveDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privacyConsentDetailsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentDirectiveEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signaturesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureImageEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentDirectiveStructuredDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationCriteriaReferencesOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criteriumInformationDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criteriumRelatedProtectedProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confidentialitySecurityObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iihiReceivingProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obligationPolicySecurityObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computablePolicyConsentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scannedPrivacyConsentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureImageObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privacyConsentHeaderDocumentationOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purposeOfUseSecurityObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refrainPolicySecurityObservationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CONSENTDIRECTIVEPackageImpl() {
		super(eNS_URI, CONSENTDIRECTIVEFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CONSENTDIRECTIVEPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CONSENTDIRECTIVEPackage init() {
		if (isInited) {
			return (CONSENTDIRECTIVEPackage) EPackage.Registry.INSTANCE.getEPackage(CONSENTDIRECTIVEPackage.eNS_URI);
		}

		// Obtain or create and register package
		CONSENTDIRECTIVEPackageImpl theCONSENTDIRECTIVEPackage = (CONSENTDIRECTIVEPackageImpl) (EPackage.Registry.INSTANCE.get(
			eNS_URI) instanceof CONSENTDIRECTIVEPackageImpl
					? EPackage.Registry.INSTANCE.get(eNS_URI)
					: new CONSENTDIRECTIVEPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CDAPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCONSENTDIRECTIVEPackage.createPackageContents();

		// Initialize created meta-data
		theCONSENTDIRECTIVEPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theCONSENTDIRECTIVEPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return CONSENTDIRECTIVEValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theCONSENTDIRECTIVEPackage.freeze();

		// publish my initializers in the registry
		Initializer.Registry.INSTANCE.registerFactory(
			"org.hl7.cbcc.privacy.consentdirective", AnnotationBasedInitializer.FACTORY);
		Initializer.Registry.INSTANCE.initializeEPackage(theCONSENTDIRECTIVEPackage);

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CONSENTDIRECTIVEPackage.eNS_URI, theCONSENTDIRECTIVEPackage);
		return theCONSENTDIRECTIVEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivacyConsentHeaderAuthor() {
		return privacyConsentHeaderAuthorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivacyConsentHeaderDocumentationOfServiceEvent() {
		return privacyConsentHeaderDocumentationOfServiceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivacyConsentDirectiveDocument() {
		return privacyConsentDirectiveDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivacyConsentDetailsSection() {
		return privacyConsentDetailsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsentDirectiveEntry() {
		return consentDirectiveEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignaturesSection() {
		return signaturesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignatureImageEntry() {
		return signatureImageEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsentDirectiveStructuredDefinition() {
		return consentDirectiveStructuredDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsentAction() {
		return consentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInformationCriteriaReferencesOrganizer() {
		return informationCriteriaReferencesOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCriteriumInformationDefinition() {
		return criteriumInformationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCriteriumRelatedProtectedProblem() {
		return criteriumRelatedProtectedProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfidentialitySecurityObservation() {
		return confidentialitySecurityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityObservation() {
		return securityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityLabel() {
		return securityLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIIHIReceivingProvider() {
		return iihiReceivingProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObligationPolicySecurityObservation() {
		return obligationPolicySecurityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComputablePolicyConsent() {
		return computablePolicyConsentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScannedPrivacyConsent() {
		return scannedPrivacyConsentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignatureImageObservation() {
		return signatureImageObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivacyConsentHeaderDocumentationOf() {
		return privacyConsentHeaderDocumentationOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPurposeOfUseSecurityObservation() {
		return purposeOfUseSecurityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefrainPolicySecurityObservation() {
		return refrainPolicySecurityObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CONSENTDIRECTIVEFactory getCONSENTDIRECTIVEFactory() {
		return (CONSENTDIRECTIVEFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		privacyConsentHeaderAuthorEClass = createEClass(PRIVACY_CONSENT_HEADER_AUTHOR);

		privacyConsentHeaderDocumentationOfServiceEventEClass = createEClass(
			PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT);

		privacyConsentDirectiveDocumentEClass = createEClass(PRIVACY_CONSENT_DIRECTIVE_DOCUMENT);

		privacyConsentDetailsSectionEClass = createEClass(PRIVACY_CONSENT_DETAILS_SECTION);

		signaturesSectionEClass = createEClass(SIGNATURES_SECTION);

		consentDirectiveEntryEClass = createEClass(CONSENT_DIRECTIVE_ENTRY);

		consentDirectiveStructuredDefinitionEClass = createEClass(CONSENT_DIRECTIVE_STRUCTURED_DEFINITION);

		consentActionEClass = createEClass(CONSENT_ACTION);

		informationCriteriaReferencesOrganizerEClass = createEClass(INFORMATION_CRITERIA_REFERENCES_ORGANIZER);

		criteriumInformationDefinitionEClass = createEClass(CRITERIUM_INFORMATION_DEFINITION);

		criteriumRelatedProtectedProblemEClass = createEClass(CRITERIUM_RELATED_PROTECTED_PROBLEM);

		confidentialitySecurityObservationEClass = createEClass(CONFIDENTIALITY_SECURITY_OBSERVATION);

		securityObservationEClass = createEClass(SECURITY_OBSERVATION);

		securityLabelEClass = createEClass(SECURITY_LABEL);

		iihiReceivingProviderEClass = createEClass(IIHI_RECEIVING_PROVIDER);

		obligationPolicySecurityObservationEClass = createEClass(OBLIGATION_POLICY_SECURITY_OBSERVATION);

		computablePolicyConsentEClass = createEClass(COMPUTABLE_POLICY_CONSENT);

		scannedPrivacyConsentEClass = createEClass(SCANNED_PRIVACY_CONSENT);

		signatureImageObservationEClass = createEClass(SIGNATURE_IMAGE_OBSERVATION);

		signatureImageEntryEClass = createEClass(SIGNATURE_IMAGE_ENTRY);

		privacyConsentHeaderDocumentationOfEClass = createEClass(PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF);

		purposeOfUseSecurityObservationEClass = createEClass(PURPOSE_OF_USE_SECURITY_OBSERVATION);

		refrainPolicySecurityObservationEClass = createEClass(REFRAIN_POLICY_SECURITY_OBSERVATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CDAPackage theCDAPackage = (CDAPackage) EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		privacyConsentHeaderAuthorEClass.getESuperTypes().add(theCDAPackage.getAuthor());
		privacyConsentHeaderDocumentationOfServiceEventEClass.getESuperTypes().add(theCDAPackage.getServiceEvent());
		privacyConsentDirectiveDocumentEClass.getESuperTypes().add(theCDAPackage.getClinicalDocument());
		privacyConsentDetailsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		signaturesSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
		consentDirectiveEntryEClass.getESuperTypes().add(theCDAPackage.getEntry());
		consentDirectiveStructuredDefinitionEClass.getESuperTypes().add(theCDAPackage.getAct());
		consentActionEClass.getESuperTypes().add(theCDAPackage.getAct());
		informationCriteriaReferencesOrganizerEClass.getESuperTypes().add(theCDAPackage.getOrganizer());
		criteriumInformationDefinitionEClass.getESuperTypes().add(theCDAPackage.getObservation());
		criteriumRelatedProtectedProblemEClass.getESuperTypes().add(theCDAPackage.getObservation());
		confidentialitySecurityObservationEClass.getESuperTypes().add(this.getSecurityObservation());
		securityObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
		securityLabelEClass.getESuperTypes().add(theCDAPackage.getOrganizer());
		iihiReceivingProviderEClass.getESuperTypes().add(theCDAPackage.getParticipant2());
		obligationPolicySecurityObservationEClass.getESuperTypes().add(this.getSecurityObservation());
		computablePolicyConsentEClass.getESuperTypes().add(theCDAPackage.getObservation());
		scannedPrivacyConsentEClass.getESuperTypes().add(theCDAPackage.getObservationMedia());
		signatureImageObservationEClass.getESuperTypes().add(theCDAPackage.getObservationMedia());
		signatureImageEntryEClass.getESuperTypes().add(theCDAPackage.getEntry());
		privacyConsentHeaderDocumentationOfEClass.getESuperTypes().add(theCDAPackage.getDocumentationOf());
		purposeOfUseSecurityObservationEClass.getESuperTypes().add(this.getSecurityObservation());
		refrainPolicySecurityObservationEClass.getESuperTypes().add(this.getSecurityObservation());

		// Initialize classes and features; add operations and parameters
		initEClass(
			privacyConsentHeaderAuthorEClass, PrivacyConsentHeaderAuthor.class, "PrivacyConsentHeaderAuthor",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(
			privacyConsentHeaderAuthorEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentHeaderAuthorTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentHeaderAuthorEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentHeaderAuthorFunctionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentHeaderAuthorEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentHeaderAuthorFunctionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentHeaderAuthorEClass, ecorePackage.getEBoolean(), "validatePrivacyConsentHeaderAuthorTime", 0,
			1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentHeaderAuthorEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentHeaderAuthorAssignedAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			privacyConsentHeaderDocumentationOfServiceEventEClass,
			PrivacyConsentHeaderDocumentationOfServiceEvent.class, "PrivacyConsentHeaderDocumentationOfServiceEvent",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			privacyConsentHeaderDocumentationOfServiceEventEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentHeaderDocumentationOfServiceEventTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentHeaderDocumentationOfServiceEventEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentHeaderDocumentationOfServiceEventCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentHeaderDocumentationOfServiceEventEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentHeaderDocumentationOfServiceEventEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			privacyConsentDirectiveDocumentEClass, PrivacyConsentDirectiveDocument.class,
			"PrivacyConsentDirectiveDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			privacyConsentDirectiveDocumentEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentDirectiveDocumentTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentDirectiveDocumentEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentDirectiveDocumentCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentDirectiveDocumentEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentDirectiveDocumentCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentDirectiveDocumentEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentDirectiveDocumentTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentDirectiveDocumentEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentDirectiveDocumentEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentDirectiveDocumentSignaturesSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentDirectiveDocumentEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentDirectiveDocumentAuthenticator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentDirectiveDocumentEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentDirectiveDocumentAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentDirectiveDocumentEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentDirectiveDocumentDocumentationOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentDirectiveDocumentEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentDirectiveDocumentInformationRecipient", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentDirectiveDocumentEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentDirectiveDocumentLegalAuthenticator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentDirectiveDocumentEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentDirectiveDocumentCustodian", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentDirectiveDocumentEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentDirectiveDocumentRecordTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentDirectiveDocumentEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentDirectiveDocumentRelatedDocument", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(
			privacyConsentDirectiveDocumentEClass, this.getPrivacyConsentDetailsSection(),
			"getPrivacyConsentDetailsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(
			privacyConsentDirectiveDocumentEClass, this.getSignaturesSection(), "getSignaturesSection", 1, 1, IS_UNIQUE,
			!IS_ORDERED);

		initEClass(
			privacyConsentDetailsSectionEClass, PrivacyConsentDetailsSection.class, "PrivacyConsentDetailsSection",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			privacyConsentDetailsSectionEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentDetailsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentDetailsSectionEClass, ecorePackage.getEBoolean(), "validatePrivacyConsentDetailsSectionCode",
			0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentDetailsSectionEClass, ecorePackage.getEBoolean(), "validatePrivacyConsentDetailsSectionCodeP",
			0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentDetailsSectionEClass, ecorePackage.getEBoolean(), "validatePrivacyConsentDetailsSectionTitle",
			0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentDetailsSectionEClass, ecorePackage.getEBoolean(), "validatePrivacyConsentDetailsSectionEntry",
			0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			signaturesSectionEClass, SignaturesSection.class, "SignaturesSection", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			signaturesSectionEClass, ecorePackage.getEBoolean(), "validateSignaturesSectionTemplateId", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			signaturesSectionEClass, ecorePackage.getEBoolean(), "validateSignaturesSectionCode", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			signaturesSectionEClass, ecorePackage.getEBoolean(), "validateSignaturesSectionCodeP", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			signaturesSectionEClass, ecorePackage.getEBoolean(), "validateSignaturesSectionText", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			signaturesSectionEClass, ecorePackage.getEBoolean(), "validateSignaturesSectionTitle", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			signaturesSectionEClass, ecorePackage.getEBoolean(), "validateSignaturesSectionEntry", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			consentDirectiveEntryEClass, ConsentDirectiveEntry.class, "ConsentDirectiveEntry", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			consentDirectiveEntryEClass, ecorePackage.getEBoolean(), "validateConsentDirectiveEntryTemplateId", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			consentDirectiveEntryEClass, ecorePackage.getEBoolean(), "validateConsentDirectiveEntryAct", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			consentDirectiveEntryEClass, ecorePackage.getEBoolean(), "validateConsentDirectiveEntryObservation", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			consentDirectiveEntryEClass, ecorePackage.getEBoolean(), "validateConsentDirectiveEntryObservationMedia", 0,
			1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			consentDirectiveStructuredDefinitionEClass, ConsentDirectiveStructuredDefinition.class,
			"ConsentDirectiveStructuredDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			consentDirectiveStructuredDefinitionEClass, ecorePackage.getEBoolean(),
			"validateConsentDirectiveStructuredDefinitionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			consentDirectiveStructuredDefinitionEClass, ecorePackage.getEBoolean(),
			"validateConsentDirectiveStructuredDefinitionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			consentDirectiveStructuredDefinitionEClass, ecorePackage.getEBoolean(),
			"validateConsentDirectiveStructuredDefinitionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			consentDirectiveStructuredDefinitionEClass, ecorePackage.getEBoolean(),
			"validateConsentDirectiveStructuredDefinitionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			consentDirectiveStructuredDefinitionEClass, ecorePackage.getEBoolean(),
			"validateConsentDirectiveStructuredDefinitionInformant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			consentDirectiveStructuredDefinitionEClass, ecorePackage.getEBoolean(),
			"validateConsentDirectiveStructuredDefinitionParticipant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			consentDirectiveStructuredDefinitionEClass, ecorePackage.getEBoolean(),
			"validateConsentDirectiveStructuredDefinitionConsentAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			consentDirectiveStructuredDefinitionEClass, ecorePackage.getEBoolean(),
			"validateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			consentDirectiveStructuredDefinitionEClass, ecorePackage.getEBoolean(),
			"validateConsentDirectiveStructuredDefinitionSecurityLabelCriteria", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(
			consentDirectiveStructuredDefinitionEClass, this.getConsentAction(), "getConsentActions", 1, -1, IS_UNIQUE,
			!IS_ORDERED);

		addEOperation(
			consentDirectiveStructuredDefinitionEClass, this.getInformationCriteriaReferencesOrganizer(),
			"getInformationCriteriaReferencesOrganizers", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(
			consentDirectiveStructuredDefinitionEClass, this.getSecurityLabel(), "getSecurityLabelCriteria", 1, -1,
			IS_UNIQUE, !IS_ORDERED);

		initEClass(
			consentActionEClass, ConsentAction.class, "ConsentAction", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			consentActionEClass, ecorePackage.getEBoolean(), "validateConsentActionTemplateId", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			consentActionEClass, ecorePackage.getEBoolean(), "validateConsentActionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			consentActionEClass, ecorePackage.getEBoolean(), "validateConsentActionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			consentActionEClass, ecorePackage.getEBoolean(), "validateConsentActionMoodCode", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			consentActionEClass, ecorePackage.getEBoolean(), "validateConsentActionNegationInd", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			informationCriteriaReferencesOrganizerEClass, InformationCriteriaReferencesOrganizer.class,
			"InformationCriteriaReferencesOrganizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			informationCriteriaReferencesOrganizerEClass, ecorePackage.getEBoolean(),
			"validateInformationCriteriaReferencesOrganizerTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			informationCriteriaReferencesOrganizerEClass, ecorePackage.getEBoolean(),
			"validateInformationCriteriaReferencesOrganizerMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			informationCriteriaReferencesOrganizerEClass, ecorePackage.getEBoolean(),
			"validateInformationCriteriaReferencesOrganizerInformationDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			informationCriteriaReferencesOrganizerEClass, ecorePackage.getEBoolean(),
			"validateInformationCriteriaReferencesOrganizerRelatedProtectedProblem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			informationCriteriaReferencesOrganizerEClass, ecorePackage.getEBoolean(),
			"validateInformationCriteriaReferencesOrganizerConfidentialityCodeLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(
			informationCriteriaReferencesOrganizerEClass, this.getCriteriumInformationDefinition(),
			"getInformationDefinitions", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(
			informationCriteriaReferencesOrganizerEClass, this.getCriteriumRelatedProtectedProblem(),
			"getRelatedProtectedProblems", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(
			informationCriteriaReferencesOrganizerEClass, this.getConfidentialitySecurityObservation(),
			"getConfidentialityCodeLabels", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(
			criteriumInformationDefinitionEClass, CriteriumInformationDefinition.class,
			"CriteriumInformationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			criteriumInformationDefinitionEClass, ecorePackage.getEBoolean(),
			"validateCriteriumInformationDefinitionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			criteriumInformationDefinitionEClass, ecorePackage.getEBoolean(),
			"validateCriteriumInformationDefinitionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			criteriumInformationDefinitionEClass, ecorePackage.getEBoolean(),
			"validateCriteriumInformationDefinitionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			criteriumInformationDefinitionEClass, ecorePackage.getEBoolean(),
			"validateCriteriumInformationDefinitionEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			criteriumInformationDefinitionEClass, ecorePackage.getEBoolean(),
			"validateCriteriumInformationDefinitionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			criteriumInformationDefinitionEClass, ecorePackage.getEBoolean(),
			"validateCriteriumInformationDefinitionId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			criteriumRelatedProtectedProblemEClass, CriteriumRelatedProtectedProblem.class,
			"CriteriumRelatedProtectedProblem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			criteriumRelatedProtectedProblemEClass, ecorePackage.getEBoolean(),
			"validateCriteriumRelatedProtectedProblemTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			criteriumRelatedProtectedProblemEClass, ecorePackage.getEBoolean(),
			"validateCriteriumRelatedProtectedProblemCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			criteriumRelatedProtectedProblemEClass, ecorePackage.getEBoolean(),
			"validateCriteriumRelatedProtectedProblemCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			criteriumRelatedProtectedProblemEClass, ecorePackage.getEBoolean(),
			"validateCriteriumRelatedProtectedProblemValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			criteriumRelatedProtectedProblemEClass, ecorePackage.getEBoolean(),
			"validateCriteriumRelatedProtectedProblemValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			confidentialitySecurityObservationEClass, ConfidentialitySecurityObservation.class,
			"ConfidentialitySecurityObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			confidentialitySecurityObservationEClass, ecorePackage.getEBoolean(),
			"validateConfidentialitySecurityObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			securityObservationEClass, SecurityObservation.class, "SecurityObservation", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			securityObservationEClass, ecorePackage.getEBoolean(), "validateSecurityObservationTemplateId", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			securityObservationEClass, ecorePackage.getEBoolean(), "validateSecurityObservationCodeP", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			securityObservationEClass, ecorePackage.getEBoolean(), "validateSecurityObservationCode", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			securityObservationEClass, ecorePackage.getEBoolean(), "validateSecurityObservationMoodCode", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			securityObservationEClass, ecorePackage.getEBoolean(), "validateSecurityObservationValue", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			securityObservationEClass, ecorePackage.getEBoolean(), "validateSecurityObservationValueP", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			securityLabelEClass, SecurityLabel.class, "SecurityLabel", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			securityLabelEClass, ecorePackage.getEBoolean(), "validateSecurityLabelTemplateId", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			securityLabelEClass, ecorePackage.getEBoolean(), "validateSecurityLabelComponent", 0, 1, IS_UNIQUE,
			IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			iihiReceivingProviderEClass, IIHIReceivingProvider.class, "IIHIReceivingProvider", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			iihiReceivingProviderEClass, ecorePackage.getEBoolean(), "validateIIHIReceivingProviderTemplateId", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			iihiReceivingProviderEClass, ecorePackage.getEBoolean(), "validateIIHIReceivingProviderTypeCodeP", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			iihiReceivingProviderEClass, ecorePackage.getEBoolean(), "validateIIHIReceivingProviderTypeCode", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			iihiReceivingProviderEClass, ecorePackage.getEBoolean(), "validateIIHIReceivingProviderParticipantRole", 0,
			1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			obligationPolicySecurityObservationEClass, ObligationPolicySecurityObservation.class,
			"ObligationPolicySecurityObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			computablePolicyConsentEClass, ComputablePolicyConsent.class, "ComputablePolicyConsent", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			computablePolicyConsentEClass, ecorePackage.getEBoolean(), "validateComputablePolicyConsentTemplateId", 0,
			1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			computablePolicyConsentEClass, ecorePackage.getEBoolean(), "validateComputablePolicyConsentCodeP", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			computablePolicyConsentEClass, ecorePackage.getEBoolean(), "validateComputablePolicyConsentCode", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			computablePolicyConsentEClass, ecorePackage.getEBoolean(), "validateComputablePolicyConsentMoodCode", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			computablePolicyConsentEClass, ecorePackage.getEBoolean(), "validateComputablePolicyConsentValue", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			scannedPrivacyConsentEClass, ScannedPrivacyConsent.class, "ScannedPrivacyConsent", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			scannedPrivacyConsentEClass, ecorePackage.getEBoolean(), "validateScannedPrivacyConsentTemplateId", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			scannedPrivacyConsentEClass, ecorePackage.getEBoolean(), "validateScannedPrivacyConsentMoodCodeP", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			scannedPrivacyConsentEClass, ecorePackage.getEBoolean(), "validateScannedPrivacyConsentMoodCode", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			scannedPrivacyConsentEClass, ecorePackage.getEBoolean(), "validateScannedPrivacyConsentValue", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			signatureImageObservationEClass, SignatureImageObservation.class, "SignatureImageObservation", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			signatureImageObservationEClass, ecorePackage.getEBoolean(), "validateSignatureImageObservationTemplateId",
			0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			signatureImageObservationEClass, ecorePackage.getEBoolean(), "validateSignatureImageObservationMoodCode", 0,
			1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			signatureImageObservationEClass, ecorePackage.getEBoolean(), "validateSignatureImageObservationValue", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			signatureImageEntryEClass, SignatureImageEntry.class, "SignatureImageEntry", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			signatureImageEntryEClass, ecorePackage.getEBoolean(), "validateSignatureImageEntryTemplateId", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			signatureImageEntryEClass, ecorePackage.getEBoolean(), "validateSignatureImageEntryObservationMedia", 0, 1,
			IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			privacyConsentHeaderDocumentationOfEClass, PrivacyConsentHeaderDocumentationOf.class,
			"PrivacyConsentHeaderDocumentationOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			privacyConsentHeaderDocumentationOfEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentHeaderDocumentationOfTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			privacyConsentHeaderDocumentationOfEClass, ecorePackage.getEBoolean(),
			"validatePrivacyConsentHeaderDocumentationOfServiceEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			purposeOfUseSecurityObservationEClass, PurposeOfUseSecurityObservation.class,
			"PurposeOfUseSecurityObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(
			purposeOfUseSecurityObservationEClass, ecorePackage.getEBoolean(),
			"validatePurposeOfUseSecurityObservationValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			purposeOfUseSecurityObservationEClass, ecorePackage.getEBoolean(),
			"validatePurposeOfUseSecurityObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(
			refrainPolicySecurityObservationEClass, RefrainPolicySecurityObservation.class,
			"RefrainPolicySecurityObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/mdht/uml
		createUmlAnnotations();
		// http://www.openhealthtools.org/mdht/uml/cda/annotation
		createAnnotationAnnotations();
		// duplicates
		createDuplicatesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/mdht/uml</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUmlAnnotations() {
		String source = "http://www.eclipse.org/mdht/uml";
		addAnnotation(this, source, new String[] { "initializers", "org.hl7.cbcc.privacy.consentdirective" });
	}

	/**
	 * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAnnotationAnnotations() {
		String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";
		addAnnotation(
			privacyConsentHeaderAuthorEClass, source,
			new String[] {
					"constraints.validation.error",
					"PrivacyConsentHeaderAuthorTemplateId PrivacyConsentHeaderAuthorFunctionCode PrivacyConsentHeaderAuthorTime PrivacyConsentHeaderAuthorAssignedAuthor",
					"templateId.root", "2.16.840.1.113883.3.445.2", "functionCode.codeSystem", "2.16.840.1.113883.5.88",
					"functionCode.codeSystemName", "ParticipationFunction", "constraints.validation.info",
					"PrivacyConsentHeaderAuthorFunctionCodeP",
					"constraints.validation.dependOn.PrivacyConsentHeaderAuthorFunctionCode",
					"PrivacyConsentHeaderAuthorFunctionCodeP" });
		addAnnotation(
			privacyConsentHeaderDocumentationOfServiceEventEClass, source,
			new String[] {
					"constraints.validation.error",
					"PrivacyConsentHeaderDocumentationOfServiceEventTemplateId PrivacyConsentHeaderDocumentationOfServiceEventCode",
					"templateId.root", "2.16.840.1.113883.3.445.3", "constraints.validation.warning",
					"PrivacyConsentHeaderDocumentationOfServiceEventEffectiveTime" });
		addAnnotation(
			privacyConsentDirectiveDocumentEClass, source,
			new String[] {
					"constraints.validation.error",
					"PrivacyConsentDirectiveDocumentTemplateId PrivacyConsentDirectiveDocumentCode PrivacyConsentDirectiveDocumentCodeP PrivacyConsentDirectiveDocumentTitle PrivacyConsentDirectiveDocumentAuthor PrivacyConsentDirectiveDocumentLegalAuthenticator PrivacyConsentDirectiveDocumentCustodian PrivacyConsentDirectiveDocumentRecordTarget",
					"templateId.root", "2.16.840.1.113883.3.445.1.1", "code.code", "57016-8", "code.codeSystem",
					"2.16.840.1.113883.6.1", "code.codeSystemName", "LOINC", "code.displayName",
					"Privacy Policy Acknowledgement Document",
					"constraints.validation.dependOn.PrivacyConsentDirectiveDocumentCode",
					"PrivacyConsentDirectiveDocumentCodeP", "title.mixed", "Authorization for Disclosure",
					"constraints.validation.warning",
					"PrivacyConsentDirectiveDocumentPrivacyConsentDetailsSection PrivacyConsentDirectiveDocumentInformationRecipient PrivacyConsentDirectiveDocumentRelatedDocument",
					"constraints.validation.info",
					"PrivacyConsentDirectiveDocumentSignaturesSection PrivacyConsentDirectiveDocumentAuthenticator PrivacyConsentDirectiveDocumentDocumentationOf" });
		addAnnotation(
			privacyConsentDetailsSectionEClass, source,
			new String[] {
					"constraints.validation.error",
					"PrivacyConsentDetailsSectionTemplateId PrivacyConsentDetailsSectionCodeP PrivacyConsentDetailsSectionEntry",
					"templateId.root", "2.16.840.1.113883.3.445.17", "code.code", "64292-6", "code.codeSystem",
					"2.16.840.1.113883.6.1", "code.codeSystemName", "LOINC", "code.displayName",
					"Release of information consent", "constraints.validation.warning",
					"PrivacyConsentDetailsSectionCode", "title.mixed", "Privacy Consent Directive Details",
					"constraints.validation.info", "PrivacyConsentDetailsSectionTitle" });
		addAnnotation(
			signaturesSectionEClass, source,
			new String[] {
					"constraints.validation.error",
					"SignaturesSectionTemplateId SignaturesSectionCode SignaturesSectionCodeP SignaturesSectionText",
					"templateId.root", "2.16.840.1.113883.3.445.18", "code.code", "57017-6", "code.codeSystem",
					"2.16.840.1.113883.6.1", "code.codeSystemName", "LOINC", "code.displayName",
					"Privacy Policy Details Signature Section", "title.mixed", "Signatures",
					"constraints.validation.warning", "SignaturesSectionTitle SignaturesSectionEntry" });
		addAnnotation(
			consentDirectiveEntryEClass, source,
			new String[] {
					"constraints.validation.error", "ConsentDirectiveEntryTemplateId", "templateId.root",
					"2.16.840.1.113883.3.445.4", "constraints.validation.warning",
					"ConsentDirectiveEntryAct ConsentDirectiveEntryObservationMedia", "constraints.validation.info",
					"ConsentDirectiveEntryObservation" });
		addAnnotation(
			consentDirectiveStructuredDefinitionEClass, source,
			new String[] {
					"constraints.validation.error",
					"ConsentDirectiveStructuredDefinitionTemplateId ConsentDirectiveStructuredDefinitionCode ConsentDirectiveStructuredDefinitionCodeP ConsentDirectiveStructuredDefinitionMoodCode",
					"templateId.root", "2.16.840.1.113883.3.445.5", "code.codeSystem", "2.16.840.1.113883.5.1063",
					"code.codeSystemName", "SecurityObservationValueCodeSystem",
					"constraints.validation.dependOn.ConsentDirectiveStructuredDefinitionCode",
					"ConsentDirectiveStructuredDefinitionCodeP", "moodCode", "DEF", "constraints.validation.warning",
					"ConsentDirectiveStructuredDefinitionInformant ConsentDirectiveStructuredDefinitionParticipant ConsentDirectiveStructuredDefinitionConsentAction ConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer",
					"constraints.validation.info", "ConsentDirectiveStructuredDefinitionSecurityLabelCriteria" });
		addAnnotation(
			consentActionEClass, source,
			new String[] {
					"constraints.validation.error",
					"ConsentActionTemplateId ConsentActionCode ConsentActionCodeP ConsentActionMoodCode",
					"templateId.root", "2.16.840.1.113883.3.445.8", "code.codeSystemName", "",
					"constraints.validation.dependOn.ConsentActionCode", "ConsentActionCodeP", "moodCode", "DEF",
					"constraints.validation.warning", "ConsentActionNegationInd" });
		addAnnotation(
			informationCriteriaReferencesOrganizerEClass, source,
			new String[] {
					"constraints.validation.error",
					"InformationCriteriaReferencesOrganizerTemplateId InformationCriteriaReferencesOrganizerMoodCode",
					"templateId.root", "2.16.840.1.113883.3.445.9", "moodCode", "DEF", "constraints.validation.info",
					"InformationCriteriaReferencesOrganizerInformationDefinition InformationCriteriaReferencesOrganizerRelatedProtectedProblem InformationCriteriaReferencesOrganizerConfidentialityCodeLabel" });
		addAnnotation(
			criteriumInformationDefinitionEClass, source,
			new String[] {
					"constraints.validation.error",
					"CriteriumInformationDefinitionTemplateId CriteriumInformationDefinitionCode CriteriumInformationDefinitionCodeP CriteriumInformationDefinitionMoodCode",
					"templateId.root", "2.16.840.1.113883.3.445.10", "code.codeSystem", "2.16.840.1.113883.6.1",
					"code.codeSystemName", "LOINC",
					"constraints.validation.dependOn.CriteriumInformationDefinitionCode",
					"CriteriumInformationDefinitionCodeP", "constraints.validation.info",
					"CriteriumInformationDefinitionEffectiveTime CriteriumInformationDefinitionId", "moodCode",
					"DEF" });
		addAnnotation(
			criteriumRelatedProtectedProblemEClass, source,
			new String[] {
					"constraints.validation.error",
					"CriteriumRelatedProtectedProblemTemplateId CriteriumRelatedProtectedProblemCodeP CriteriumRelatedProtectedProblemValueP",
					"templateId.root", "2.16.840.1.113883.3.445.11", "code.codeSystem", "2.16.840.1.113883.6.96",
					"code.codeSystemName", "SNOMEDCT", "constraints.validation.warning",
					"CriteriumRelatedProtectedProblemCode CriteriumRelatedProtectedProblemValue",
					"constraints.validation.dependOn.CriteriumRelatedProtectedProblemCode",
					"CriteriumRelatedProtectedProblemCodeP", "value.codeSystem", "2.16.840.1.113883.6.96",
					"value.codeSystemName", "SNOMEDCT" });
		addAnnotation(
			confidentialitySecurityObservationEClass, source,
			new String[] {
					"constraints.validation.error",
					"SecurityObservationTemplateId SecurityObservationCode SecurityObservationCodeP ConfidentialitySecurityObservationValue",
					"templateId.root", "2.16.840.1.113883.3.445.12", "code.code", "SECCLASSOBS", "code.codeSystem",
					"2.16.840.1.113883.1.11.20471", "code.codeSystemName", "SecurityControlObservationValue",
					"code.displayName", "Security Category", "constraints.validation.dependOn.SecurityObservationCode",
					"SecurityObservationCodeP" });
		addAnnotation(
			securityObservationEClass, source,
			new String[] {
					"constraints.validation.error",
					"SecurityObservationTemplateId SecurityObservationCode SecurityObservationCodeP SecurityObservationMoodCode SecurityObservationValue SecurityObservationValueP",
					"templateId.root", "2.16.840.1.113883.3.445.21", "code.codeSystem", "2.16.840.1.113883.1.11.20471",
					"code.codeSystemName", "SecurityControlObservationValue",
					"constraints.validation.dependOn.SecurityObservationCode", "SecurityObservationCodeP", "moodCode",
					"DEF", "value.codeSystem", "2.16.840.1.113883.5.1063", "value.codeSystemName",
					"SecurityObservationValueCodeSystem" });
		addAnnotation(
			securityLabelEClass, source,
			new String[] {
					"constraints.validation.error", "SecurityLabelTemplateId SecurityLabelComponent", "templateId.root",
					"2.16.840.1.113883.3.445.24" });
		addAnnotation(
			iihiReceivingProviderEClass, source,
			new String[] {
					"constraints.validation.error",
					"IIHIReceivingProviderTemplateId IIHIReceivingProviderTypeCode IIHIReceivingProviderTypeCodeP IIHIReceivingProviderParticipantRole",
					"templateId.root", "2.16.840.1.113883.3.445.7", "typeCode", "IRCP",
					"constraints.validation.dependOn.IIHIReceivingProviderTypeCode",
					"IIHIReceivingProviderTypeCodeP" });
		addAnnotation(
			obligationPolicySecurityObservationEClass, source,
			new String[] {
					"constraints.validation.error",
					"SecurityObservationTemplateId SecurityObservationCode SecurityObservationCodeP SecurityObservationValueP",
					"templateId.root", "2.16.840.1.113883.3.445.14", "code.code", "SECCONOBS", "code.codeSystem",
					"2.16.840.1.113883.1.11.20471", "code.codeSystemName", "SecurityControlObservationValue",
					"code.displayName", "Security Control", "constraints.validation.dependOn.SecurityObservationCode",
					"SecurityObservationCodeP", "value.codeSystem", "2.16.840.1.113883.1.11.20471",
					"value.codeSystemName", "SecurityControlObservationValue", "constraints.validation.warning",
					"SecurityObservationValue", "constraints.validation.dependOn.SecurityObservationValue",
					"SecurityObservationValueP" });
		addAnnotation(
			computablePolicyConsentEClass, source,
			new String[] {
					"constraints.validation.error",
					"ComputablePolicyConsentTemplateId ComputablePolicyConsentCodeP ComputablePolicyConsentMoodCode",
					"templateId.root", "2.16.840.1.113883.3.445.16", "code.code", "57016-8", "code.codeSystem",
					"2.16.840.1.113883.6.1", "code.codeSystemName", "LOINC", "code.displayName",
					"Privacy Policy Acknowledgement Document", "constraints.validation.info",
					"ComputablePolicyConsentCode", "constraints.validation.dependOn.ComputablePolicyConsentCode",
					"ComputablePolicyConsentCodeP", "moodCode", "DEF", "constraints.validation.warning",
					"ComputablePolicyConsentValue" });
		addAnnotation(
			scannedPrivacyConsentEClass, source,
			new String[] {
					"constraints.validation.error",
					"ScannedPrivacyConsentTemplateId ScannedPrivacyConsentMoodCode ScannedPrivacyConsentMoodCodeP ScannedPrivacyConsentValue",
					"templateId.root", "2.16.840.1.113883.3.445.15", "moodCode", "DEF",
					"constraints.validation.dependOn.ScannedPrivacyConsentMoodCode",
					"ScannedPrivacyConsentMoodCodeP" });
		addAnnotation(
			signatureImageObservationEClass, source,
			new String[] {
					"constraints.validation.error",
					"SignatureImageObservationTemplateId SignatureImageObservationMoodCode SignatureImageObservationValue",
					"templateId.root", "2.16.840.1.113883.3.445.19", "moodCode", "EVN" });
		addAnnotation(
			signatureImageEntryEClass, source,
			new String[] {
					"constraints.validation.error", "SignatureImageEntryTemplateId SignatureImageEntryObservationMedia",
					"templateId.root", "2.16.840.1.113883.3.445.20" });
		addAnnotation(
			privacyConsentHeaderDocumentationOfEClass, source,
			new String[] {
					"constraints.validation.error",
					"PrivacyConsentHeaderDocumentationOfTemplateId PrivacyConsentHeaderDocumentationOfServiceEvent",
					"templateId.root", "2.16.840.1.113883.3.445.26" });
		addAnnotation(
			purposeOfUseSecurityObservationEClass, source,
			new String[] {
					"constraints.validation.error",
					"SecurityObservationTemplateId SecurityObservationCode SecurityObservationCodeP PurposeOfUseSecurityObservationValue PurposeOfUseSecurityObservationValueP",
					"templateId.root", "2.16.840.1.113883.3.445.22", "code.code", "SECCONOBS", "code.codeSystem",
					"2.16.840.1.113883.1.11.20471", "code.codeSystemName", "SecurityControlObservationValue",
					"code.displayName", "Security Control", "constraints.validation.dependOn.SecurityObservationCode",
					"SecurityObservationCodeP", "value.codeSystem", "2.16.840.1.113883.5.1063", "value.codeSystemName",
					"SecurityObservationValueCodeSystem",
					"constraints.validation.dependOn.PurposeOfUseSecurityObservationValue",
					"PurposeOfUseSecurityObservationValueP" });
		addAnnotation(
			refrainPolicySecurityObservationEClass, source,
			new String[] {
					"constraints.validation.error",
					"SecurityObservationTemplateId SecurityObservationCode SecurityObservationCodeP SecurityObservationValueP",
					"templateId.root", "2.16.840.1.113883.3.445.23", "code.code", "SECCONOBS", "code.codeSystem",
					"2.16.840.1.113883.1.11.20471", "code.codeSystemName", "SecurityControlObservationValue",
					"code.displayName", "Security Control Observation Type",
					"constraints.validation.dependOn.SecurityObservationCode", "SecurityObservationCodeP",
					"value.codeSystem", "2.16.840.1.113883.1.11.20471", "value.codeSystemName",
					"SecurityControlObservationValue", "constraints.validation.warning", "SecurityObservationValue",
					"constraints.validation.dependOn.SecurityObservationValue", "SecurityObservationValueP" });
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";
		addAnnotation(confidentialitySecurityObservationEClass, source, new String[] {});
		addAnnotation(obligationPolicySecurityObservationEClass, source, new String[] {});
		addAnnotation(purposeOfUseSecurityObservationEClass, source, new String[] {});
		addAnnotation(refrainPolicySecurityObservationEClass, source, new String[] {});
	}

} // CONSENTDIRECTIVEPackageImpl
