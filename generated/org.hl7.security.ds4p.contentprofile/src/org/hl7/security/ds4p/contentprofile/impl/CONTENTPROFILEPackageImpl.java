/**
 * Contributors:
 * Sean Muir (JKM) - initial API and implementation
 * Dan Brown (Ai) - Added method implementations to support the unloading and reloading
 *    				of the DS4P Package from the registry
 */
package org.hl7.security.ds4p.contentprofile.impl;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.CDAPackage;
import org.eclipse.mdht.uml.cda.util.AnnotationBasedInitializer;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.eclipse.mdht.uml.hl7.rim.RIMPackage;
import org.eclipse.mdht.uml.hl7.vocab.VocabPackage;
import org.eclipse.uml2.types.TypesPackage;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage;
import org.hl7.security.ds4p.contentprofile.ConfidentialitySecurityObservation;
import org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor;
import org.hl7.security.ds4p.contentprofile.MandatoryDocumentProvenance;
import org.hl7.security.ds4p.contentprofile.MandatoryEntryAssignedAuthor;
import org.hl7.security.ds4p.contentprofile.MandatoryEntryProvenance;
import org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation;
import org.hl7.security.ds4p.contentprofile.PrivacyAnnotation;
import org.hl7.security.ds4p.contentprofile.PrivacyAnnotationEntryRelationship;
import org.hl7.security.ds4p.contentprofile.PrivacyMarkingsEntry;
import org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection;
import org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument;
import org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection;
import org.hl7.security.ds4p.contentprofile.ProtectedProblem;
import org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation;
import org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation;
import org.hl7.security.ds4p.contentprofile.SecurityObservation;
import org.hl7.security.ds4p.contentprofile.util.CONTENTPROFILEValidator;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CONTENTPROFILEPackageImpl extends EPackageImpl implements CONTENTPROFILEPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass privacySegmentedDocumentEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass privacySegmentedSectionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass privacyMarkingsSectionEClass = null;

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
	private EClass securityObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mandatoryDocumentProvenanceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mandatoryDocumentAssignedAuthorEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass privacyAnnotationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass refrainPolicySecurityObservationEClass = null;

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
	private EClass confidentialitySecurityObservationEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass protectedProblemEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mandatoryEntryProvenanceEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mandatoryEntryAssignedAuthorEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass privacyAnnotationEntryRelationshipEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass privacyMarkingsEntryEClass = null;

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
     * @see org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private CONTENTPROFILEPackageImpl() {
        super(eNS_URI, CONTENTPROFILEFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link CONTENTPROFILEPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static CONTENTPROFILEPackage init() {
        if (isInited) return (CONTENTPROFILEPackage)EPackage.Registry.INSTANCE.getEPackage(CONTENTPROFILEPackage.eNS_URI);

        // Obtain or create and register package
        CONTENTPROFILEPackageImpl theCONTENTPROFILEPackage = (CONTENTPROFILEPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CONTENTPROFILEPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CONTENTPROFILEPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        CDAPackage.eINSTANCE.eClass();
        ConsolPackage.eINSTANCE.eClass();
        DatatypesPackage.eINSTANCE.eClass();
        EcorePackage.eINSTANCE.eClass();
        RIMPackage.eINSTANCE.eClass();
        TypesPackage.eINSTANCE.eClass();
        VocabPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theCONTENTPROFILEPackage.createPackageContents();

        // Initialize created meta-data
        theCONTENTPROFILEPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theCONTENTPROFILEPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return CONTENTPROFILEValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theCONTENTPROFILEPackage.freeze();

  
        // publish my initializers in the registry
        Initializer.Registry.INSTANCE.registerFactory("org.hl7.security.ds4p.contentprofile", AnnotationBasedInitializer.FACTORY);
        Initializer.Registry.INSTANCE.initializeEPackage(theCONTENTPROFILEPackage);
                
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CONTENTPROFILEPackage.eNS_URI, theCONTENTPROFILEPackage);
        return theCONTENTPROFILEPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EClass getPrivacySegmentedDocument() {
        return privacySegmentedDocumentEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EClass getPrivacySegmentedSection() {
        return privacySegmentedSectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EClass getPrivacyMarkingsSection() {
        return privacyMarkingsSectionEClass;
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
	public EClass getSecurityObservation() {
        return securityObservationEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EClass getMandatoryDocumentProvenance() {
        return mandatoryDocumentProvenanceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EClass getMandatoryDocumentAssignedAuthor() {
        return mandatoryDocumentAssignedAuthorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EClass getPrivacyAnnotation() {
        return privacyAnnotationEClass;
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
	public EClass getPurposeOfUseSecurityObservation() {
        return purposeOfUseSecurityObservationEClass;
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
	public EClass getProtectedProblem() {
        return protectedProblemEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EClass getMandatoryEntryProvenance() {
        return mandatoryEntryProvenanceEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EClass getMandatoryEntryAssignedAuthor() {
        return mandatoryEntryAssignedAuthorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EClass getPrivacyAnnotationEntryRelationship() {
        return privacyAnnotationEntryRelationshipEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EClass getPrivacyMarkingsEntry() {
        return privacyMarkingsEntryEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public CONTENTPROFILEFactory getCONTENTPROFILEFactory() {
        return (CONTENTPROFILEFactory)getEFactoryInstance();
    }

	/**
	 * @generated NOT
	 */
	private static boolean isUnloaded = false;

	/**
	 * @generated NOT
	 */
	@Override
	public void unload() {
		if (isUnloaded) {
			return;
		}

		for (Iterator<String> iter = EPackage.Registry.INSTANCE.keySet().iterator(); iter.hasNext();) {
			String key = iter.next();
			if (key.equals(CONTENTPROFILEPackage.eNS_URI)) {
				iter.remove();
			}
		}

		isUnloaded = true;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void reload() {
		if (!isUnloaded) {
			return;
		}
		// since ds4p is not in the registry, add it back
		EPackage.Registry.INSTANCE.put(CONTENTPROFILEPackage.eNS_URI, this);

		isUnloaded = false;
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
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        privacySegmentedDocumentEClass = createEClass(PRIVACY_SEGMENTED_DOCUMENT);

        privacySegmentedSectionEClass = createEClass(PRIVACY_SEGMENTED_SECTION);

        privacyMarkingsSectionEClass = createEClass(PRIVACY_MARKINGS_SECTION);

        obligationPolicySecurityObservationEClass = createEClass(OBLIGATION_POLICY_SECURITY_OBSERVATION);

        securityObservationEClass = createEClass(SECURITY_OBSERVATION);

        mandatoryDocumentProvenanceEClass = createEClass(MANDATORY_DOCUMENT_PROVENANCE);

        mandatoryDocumentAssignedAuthorEClass = createEClass(MANDATORY_DOCUMENT_ASSIGNED_AUTHOR);

        privacyAnnotationEClass = createEClass(PRIVACY_ANNOTATION);

        refrainPolicySecurityObservationEClass = createEClass(REFRAIN_POLICY_SECURITY_OBSERVATION);

        purposeOfUseSecurityObservationEClass = createEClass(PURPOSE_OF_USE_SECURITY_OBSERVATION);

        confidentialitySecurityObservationEClass = createEClass(CONFIDENTIALITY_SECURITY_OBSERVATION);

        protectedProblemEClass = createEClass(PROTECTED_PROBLEM);

        mandatoryEntryProvenanceEClass = createEClass(MANDATORY_ENTRY_PROVENANCE);

        mandatoryEntryAssignedAuthorEClass = createEClass(MANDATORY_ENTRY_ASSIGNED_AUTHOR);

        privacyAnnotationEntryRelationshipEClass = createEClass(PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP);

        privacyMarkingsEntryEClass = createEClass(PRIVACY_MARKINGS_ENTRY);
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
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        ConsolPackage theConsolPackage = (ConsolPackage)EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI);
        CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        privacySegmentedDocumentEClass.getESuperTypes().add(theConsolPackage.getGeneralHeaderConstraints());
        privacySegmentedSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        privacyMarkingsSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
        obligationPolicySecurityObservationEClass.getESuperTypes().add(this.getSecurityObservation());
        securityObservationEClass.getESuperTypes().add(theCDAPackage.getObservation());
        mandatoryDocumentProvenanceEClass.getESuperTypes().add(theCDAPackage.getAuthor());
        mandatoryDocumentAssignedAuthorEClass.getESuperTypes().add(theCDAPackage.getAssignedAuthor());
        privacyAnnotationEClass.getESuperTypes().add(theCDAPackage.getOrganizer());
        refrainPolicySecurityObservationEClass.getESuperTypes().add(this.getSecurityObservation());
        purposeOfUseSecurityObservationEClass.getESuperTypes().add(this.getSecurityObservation());
        confidentialitySecurityObservationEClass.getESuperTypes().add(this.getSecurityObservation());
        protectedProblemEClass.getESuperTypes().add(theConsolPackage.getProblemObservation());
        mandatoryEntryProvenanceEClass.getESuperTypes().add(theCDAPackage.getAuthor());
        mandatoryEntryAssignedAuthorEClass.getESuperTypes().add(theCDAPackage.getAssignedAuthor());
        privacyAnnotationEntryRelationshipEClass.getESuperTypes().add(theCDAPackage.getEntryRelationship());
        privacyMarkingsEntryEClass.getESuperTypes().add(theCDAPackage.getEntry());

        // Initialize classes and features; add operations and parameters
        initEClass(privacySegmentedDocumentEClass, PrivacySegmentedDocument.class, "PrivacySegmentedDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = addEOperation(privacySegmentedDocumentEClass, ecorePackage.getEBoolean(), "validatePrivacySegmentedDocumentTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacySegmentedDocumentEClass, ecorePackage.getEBoolean(), "validatePrivacySegmentedDocumentAuthor1", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacySegmentedDocumentEClass, ecorePackage.getEBoolean(), "validatePrivacySegmentedDocumentSegmentedSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacySegmentedDocumentEClass, ecorePackage.getEBoolean(), "validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(privacySegmentedDocumentEClass, this.getPrivacySegmentedSection(), "getSegmentedSections", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(privacySegmentedDocumentEClass, this.getPrivacyMarkingsSection(), "getPrivacyAndSecurityMarkingsSections", 1, -1, IS_UNIQUE, !IS_ORDERED);

        initEClass(privacySegmentedSectionEClass, PrivacySegmentedSection.class, "PrivacySegmentedSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(privacySegmentedSectionEClass, ecorePackage.getEBoolean(), "validatePrivacySegmentedSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacySegmentedSectionEClass, ecorePackage.getEBoolean(), "validatePrivacySegmentedSectionConfidentialityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacySegmentedSectionEClass, ecorePackage.getEBoolean(), "validatePrivacySegmentedSectionConfidentialityCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacySegmentedSectionEClass, ecorePackage.getEBoolean(), "validatePrivacySegmentedSectionAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(privacyMarkingsSectionEClass, PrivacyMarkingsSection.class, "PrivacyMarkingsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(privacyMarkingsSectionEClass, ecorePackage.getEBoolean(), "validatePrivacyMarkingsSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacyMarkingsSectionEClass, ecorePackage.getEBoolean(), "validatePrivacyMarkingsSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacyMarkingsSectionEClass, ecorePackage.getEBoolean(), "validatePrivacyMarkingsSectionCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacyMarkingsSectionEClass, ecorePackage.getEBoolean(), "validatePrivacyMarkingsSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacyMarkingsSectionEClass, ecorePackage.getEBoolean(), "validatePrivacyMarkingsSectionEntry1", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(obligationPolicySecurityObservationEClass, ObligationPolicySecurityObservation.class, "ObligationPolicySecurityObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(securityObservationEClass, SecurityObservation.class, "SecurityObservation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(securityObservationEClass, ecorePackage.getEBoolean(), "validateSecurityObservationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(securityObservationEClass, ecorePackage.getEBoolean(), "validateSecurityObservationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(securityObservationEClass, ecorePackage.getEBoolean(), "validateSecurityObservationCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(securityObservationEClass, ecorePackage.getEBoolean(), "validateSecurityObservationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(securityObservationEClass, ecorePackage.getEBoolean(), "validateSecurityObservationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(securityObservationEClass, ecorePackage.getEBoolean(), "validateSecurityObservationValueP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(mandatoryDocumentProvenanceEClass, MandatoryDocumentProvenance.class, "MandatoryDocumentProvenance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(mandatoryDocumentProvenanceEClass, ecorePackage.getEBoolean(), "validateMandatoryDocumentProvenanceTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mandatoryDocumentProvenanceEClass, ecorePackage.getEBoolean(), "validateMandatoryDocumentProvenanceTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mandatoryDocumentProvenanceEClass, ecorePackage.getEBoolean(), "validateMandatoryDocumentProvenanceAssignedAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(mandatoryDocumentAssignedAuthorEClass, MandatoryDocumentAssignedAuthor.class, "MandatoryDocumentAssignedAuthor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(mandatoryDocumentAssignedAuthorEClass, ecorePackage.getEBoolean(), "validateMandatoryDocumentAssignedAuthorTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mandatoryDocumentAssignedAuthorEClass, ecorePackage.getEBoolean(), "validateMandatoryDocumentAssignedAuthorTelecomEmail", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mandatoryDocumentAssignedAuthorEClass, ecorePackage.getEBoolean(), "validateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mandatoryDocumentAssignedAuthorEClass, ecorePackage.getEBoolean(), "validateMandatoryDocumentAssignedAuthorAssignedPerson", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mandatoryDocumentAssignedAuthorEClass, ecorePackage.getEBoolean(), "validateMandatoryDocumentAssignedAuthorRepresentedOrganization", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(privacyAnnotationEClass, PrivacyAnnotation.class, "PrivacyAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(privacyAnnotationEClass, ecorePackage.getEBoolean(), "validatePrivacyAnnotationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacyAnnotationEClass, ecorePackage.getEBoolean(), "validatePrivacyAnnotationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacyAnnotationEClass, ecorePackage.getEBoolean(), "validatePrivacyAnnotationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacyAnnotationEClass, ecorePackage.getEBoolean(), "validatePrivacyAnnotationStatusCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacyAnnotationEClass, ecorePackage.getEBoolean(), "validatePrivacyAnnotationStatusCode", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacyAnnotationEClass, ecorePackage.getEBoolean(), "validatePrivacyAnnotationObligationPolicySecurityObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacyAnnotationEClass, ecorePackage.getEBoolean(), "validatePrivacyAnnotationRefrainPolicySecurityObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacyAnnotationEClass, ecorePackage.getEBoolean(), "validatePrivacyAnnotationPurposeOfUseSecurityObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacyAnnotationEClass, ecorePackage.getEBoolean(), "validatePrivacyAnnotationConfidentialityCodeSecurityObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(privacyAnnotationEClass, this.getObligationPolicySecurityObservation(), "getObligationPolicySecurityObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(privacyAnnotationEClass, this.getRefrainPolicySecurityObservation(), "getRefrainPolicySecurityObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(privacyAnnotationEClass, this.getPurposeOfUseSecurityObservation(), "getPurposeOfUseSecurityObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

        addEOperation(privacyAnnotationEClass, this.getConfidentialitySecurityObservation(), "getConfidentialityCodeSecurityObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

        initEClass(refrainPolicySecurityObservationEClass, RefrainPolicySecurityObservation.class, "RefrainPolicySecurityObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(purposeOfUseSecurityObservationEClass, PurposeOfUseSecurityObservation.class, "PurposeOfUseSecurityObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(confidentialitySecurityObservationEClass, ConfidentialitySecurityObservation.class, "ConfidentialitySecurityObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(protectedProblemEClass, ProtectedProblem.class, "ProtectedProblem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(protectedProblemEClass, ecorePackage.getEBoolean(), "validateProtectedProblemProblemProvenance", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(protectedProblemEClass, ecorePackage.getEBoolean(), "validateProtectedProblemPrivacyAnnotations", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(mandatoryEntryProvenanceEClass, MandatoryEntryProvenance.class, "MandatoryEntryProvenance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(mandatoryEntryProvenanceEClass, ecorePackage.getEBoolean(), "validateMandatoryEntryProvenanceTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mandatoryEntryProvenanceEClass, ecorePackage.getEBoolean(), "validateMandatoryEntryProvenanceTime", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mandatoryEntryProvenanceEClass, ecorePackage.getEBoolean(), "validateMandatoryEntryProvenanceAssignedAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(mandatoryEntryAssignedAuthorEClass, MandatoryEntryAssignedAuthor.class, "MandatoryEntryAssignedAuthor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(mandatoryEntryAssignedAuthorEClass, ecorePackage.getEBoolean(), "validateMandatoryEntryAssignedAuthorTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mandatoryEntryAssignedAuthorEClass, ecorePackage.getEBoolean(), "validateMandatoryEntryAssignedAuthorAssignedAuthoringDevice", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mandatoryEntryAssignedAuthorEClass, ecorePackage.getEBoolean(), "validateMandatoryEntryAssignedAuthorAssignedPerson", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(mandatoryEntryAssignedAuthorEClass, ecorePackage.getEBoolean(), "validateMandatoryEntryAssignedAuthorRepresentedOrganization", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(privacyAnnotationEntryRelationshipEClass, PrivacyAnnotationEntryRelationship.class, "PrivacyAnnotationEntryRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(privacyAnnotationEntryRelationshipEClass, ecorePackage.getEBoolean(), "validatePrivacyAnnotationEntryRelationshipTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacyAnnotationEntryRelationshipEClass, ecorePackage.getEBoolean(), "validatePrivacyAnnotationEntryRelationshipOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(privacyMarkingsEntryEClass, PrivacyMarkingsEntry.class, "PrivacyMarkingsEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = addEOperation(privacyMarkingsEntryEClass, ecorePackage.getEBoolean(), "validatePrivacyMarkingsEntryTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = addEOperation(privacyMarkingsEntryEClass, ecorePackage.getEBoolean(), "validatePrivacyMarkingsEntryOrganizer", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

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
        addAnnotation
          (this, 
           source, 
           new String[] {
             "initializers", "org.hl7.security.ds4p.contentprofile"
           });                                                                                                                                                                              
    }

	/**
     * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createAnnotationAnnotations() {
        String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";      
        addAnnotation
          (privacySegmentedDocumentEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "PrivacySegmentedDocumentTemplateId PrivacySegmentedDocumentAuthor1",
             "templateId.root", "2.16.840.1.113883.3.3251.1.1",
             "constraints.validation.info", "PrivacySegmentedDocumentSegmentedSection",
             "constraints.validation.warning", "PrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection"
           });                   
        addAnnotation
          (privacySegmentedSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "PrivacySegmentedSectionTemplateId PrivacySegmentedSectionConfidentialityCode",
             "templateId.root", "2.16.840.1.113883.3.3251.1.10",
             "confidentialityCode.codeSystemName", "",
             "constraints.validation.warning", "PrivacySegmentedSectionConfidentialityCodeP PrivacySegmentedSectionAuthor"
           });                 
        addAnnotation
          (privacyMarkingsSectionEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "PrivacyMarkingsSectionTemplateId PrivacyMarkingsSectionCodeP PrivacyMarkingsSectionText",
             "templateId.root", "2.16.840.1.113883.3.3251.1.5",
             "code.code", "57017-6",
             "code.codeSystemName", "",
             "code.displayName", "Privacy Policy",
             "constraints.validation.warning", "PrivacyMarkingsSectionCode",
             "constraints.validation.info", "PrivacyMarkingsSectionEntry1"
           });                    
        addAnnotation
          (obligationPolicySecurityObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "SecurityObservationTemplateId SecurityObservationCode SecurityObservationCodeP SecurityObservationValueP",
             "templateId.root", "2.16.840.1.113883.3.445.14",
             "code.code", "SECCONOBS",
             "code.codeSystem", "2.16.840.1.113883.1.11.20457",
             "code.codeSystemName", "SecurityObservationTypeCodeSystem",
             "code.displayName", "Security Control",
             "constraints.validation.dependOn.SecurityObservationCode", "SecurityObservationCodeP",
             "value.codeSystemName", "",
             "constraints.validation.warning", "SecurityObservationValue",
             "constraints.validation.dependOn.SecurityObservationValue", "SecurityObservationValueP"
           });      
        addAnnotation
          (securityObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "SecurityObservationTemplateId SecurityObservationMoodCode SecurityObservationCode SecurityObservationCodeP SecurityObservationValue SecurityObservationValueP",
             "templateId.root", "2.16.840.1.113883.3.445.21",
             "moodCode", "EVN",
             "code.codeSystem", "2.16.840.1.113883.1.11.20457",
             "code.codeSystemName", "SecurityObservationTypeCodeSystem",
             "constraints.validation.dependOn.SecurityObservationCode", "SecurityObservationCodeP",
             "value.codeSystem", "2.16.840.1.113883.5.1063",
             "value.codeSystemName", "SecurityObservationValueCodeSystem"
           });                       
        addAnnotation
          (mandatoryDocumentProvenanceEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "MandatoryDocumentProvenanceTemplateId MandatoryDocumentProvenanceTime MandatoryDocumentProvenanceAssignedAuthor",
             "templateId.root", "2.16.840.1.113883.3.3251.1.2"
           });              
        addAnnotation
          (mandatoryDocumentAssignedAuthorEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "MandatoryDocumentAssignedAuthorTemplateId MandatoryDocumentAssignedAuthorTelecomEmail",
             "templateId.root", "2.16.840.1.113883.3.3251.1.3",
             "constraints.validation.warning", "MandatoryDocumentAssignedAuthorAssignedAuthoringDevice MandatoryDocumentAssignedAuthorAssignedPerson MandatoryDocumentAssignedAuthorRepresentedOrganization"
           });                    
        addAnnotation
          (privacyAnnotationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "PrivacyAnnotationTemplateId PrivacyAnnotationClassCode PrivacyAnnotationMoodCode PrivacyAnnotationStatusCode PrivacyAnnotationStatusCodeP PrivacyAnnotationConfidentialityCodeSecurityObservation",
             "templateId.root", "2.16.840.1.113883.3.3251.1.4",
             "classCode", "CLUSTER",
             "moodCode", "EVN",
             "statusCode.code", "active",
             "constraints.validation.dependOn.PrivacyAnnotationStatusCode", "PrivacyAnnotationStatusCodeP",
             "constraints.validation.info", "PrivacyAnnotationObligationPolicySecurityObservation PrivacyAnnotationRefrainPolicySecurityObservation PrivacyAnnotationPurposeOfUseSecurityObservation"
           });                                    
        addAnnotation
          (refrainPolicySecurityObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "SecurityObservationTemplateId SecurityObservationCode SecurityObservationCodeP SecurityObservationValue SecurityObservationValueP",
             "templateId.root", "2.16.840.1.113883.3.445.23",
             "code.code", "SECCONOBS",
             "code.codeSystem", "2.16.840.1.113883.1.11.20457",
             "code.codeSystemName", "SecurityObservationTypeCodeSystem",
             "code.displayName", "Security Control Observation Type",
             "constraints.validation.dependOn.SecurityObservationCode", "SecurityObservationCodeP",
             "value.codeSystemName", "",
             "constraints.validation.dependOn.SecurityObservationValue", "SecurityObservationValueP"
           });      
        addAnnotation
          (purposeOfUseSecurityObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "SecurityObservationTemplateId SecurityObservationCode SecurityObservationCodeP SecurityObservationValue",
             "templateId.root", "2.16.840.1.113883.3.445.22",
             "code.code", "SECCONOBS",
             "code.codeSystem", "2.16.840.1.113883.1.11.20457",
             "code.codeSystemName", "SecurityObservationTypeCodeSystem",
             "code.displayName", "Security Control",
             "constraints.validation.dependOn.SecurityObservationCode", "SecurityObservationCodeP"
           });      
        addAnnotation
          (confidentialitySecurityObservationEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "SecurityObservationTemplateId SecurityObservationCode SecurityObservationCodeP SecurityObservationValue",
             "templateId.root", "2.16.840.1.113883.3.445.12",
             "code.code", "SECCLASSOBS",
             "code.codeSystem", "2.16.840.1.113883.1.11.20471",
             "code.codeSystemName", "SecurityControlObservationValue",
             "code.displayName", "Security Category",
             "constraints.validation.dependOn.SecurityObservationCode", "SecurityObservationCodeP"
           });      
        addAnnotation
          (protectedProblemEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "ProblemObservationTemplateId ProtectedProblemProblemProvenance ProtectedProblemPrivacyAnnotations",
             "templateId.root", "2.16.840.1.113883.3.3251.1.8"
           });            
        addAnnotation
          (mandatoryEntryProvenanceEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "MandatoryEntryProvenanceTemplateId MandatoryEntryProvenanceTime MandatoryEntryProvenanceAssignedAuthor",
             "templateId.root", "2.16.840.1.113883.3.3251.1.6"
           });              
        addAnnotation
          (mandatoryEntryAssignedAuthorEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "MandatoryEntryAssignedAuthorTemplateId MandatoryEntryAssignedAuthorAssignedAuthoringDevice MandatoryEntryAssignedAuthorAssignedPerson MandatoryEntryAssignedAuthorRepresentedOrganization",
             "templateId.root", "2.16.840.1.113883.3.3251.1.7"
           });                 
        addAnnotation
          (privacyAnnotationEntryRelationshipEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "PrivacyAnnotationEntryRelationshipTemplateId PrivacyAnnotationEntryRelationshipOrganizer",
             "templateId.root", "2.16.840.1.113883.3.3251.1.11"
           });           
        addAnnotation
          (privacyMarkingsEntryEClass, 
           source, 
           new String[] {
             "constraints.validation.error", "PrivacyMarkingsEntryTemplateId PrivacyMarkingsEntryOrganizer",
             "templateId.root", "2.16.840.1.113883.3.3251.1.9"
           });      
    }

	/**
     * Initializes the annotations for <b>duplicates</b>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void createDuplicatesAnnotations() {
        String source = "duplicates";                                                   
        addAnnotation
          (obligationPolicySecurityObservationEClass, 
           source, 
           new String[] {
           });                                                                                   
        addAnnotation
          (refrainPolicySecurityObservationEClass, 
           source, 
           new String[] {
           });      
        addAnnotation
          (purposeOfUseSecurityObservationEClass, 
           source, 
           new String[] {
           });      
        addAnnotation
          (confidentialitySecurityObservationEClass, 
           source, 
           new String[] {
           });      
        addAnnotation
          (protectedProblemEClass, 
           source, 
           new String[] {
           });                                           
    }

} // CONTENTPROFILEPackageImpl
