/**
 */
package org.hl7.security.ds4p.contentprofile.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.hl7.security.ds4p.contentprofile.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CONTENTPROFILEFactoryImpl extends EFactoryImpl implements CONTENTPROFILEFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CONTENTPROFILEFactory init() {
		try {
			CONTENTPROFILEFactory theCONTENTPROFILEFactory = (CONTENTPROFILEFactory) EPackage.Registry.INSTANCE.getEFactory(
				CONTENTPROFILEPackage.eNS_URI);
			if (theCONTENTPROFILEFactory != null) {
				return theCONTENTPROFILEFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CONTENTPROFILEFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTENTPROFILEFactoryImpl() {
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
			case CONTENTPROFILEPackage.PRIVACY_SEGMENTED_DOCUMENT:
				return createPrivacySegmentedDocument();
			case CONTENTPROFILEPackage.PRIVACY_SEGMENTED_SECTION:
				return createPrivacySegmentedSection();
			case CONTENTPROFILEPackage.PRIVACY_MARKINGS_SECTION:
				return createPrivacyMarkingsSection();
			case CONTENTPROFILEPackage.OBLIGATION_POLICY_SECURITY_OBSERVATION:
				return createObligationPolicySecurityObservation();
			case CONTENTPROFILEPackage.MANDATORY_DOCUMENT_PROVENANCE:
				return createMandatoryDocumentProvenance();
			case CONTENTPROFILEPackage.MANDATORY_DOCUMENT_ASSIGNED_AUTHOR:
				return createMandatoryDocumentAssignedAuthor();
			case CONTENTPROFILEPackage.PRIVACY_ANNOTATION:
				return createPrivacyAnnotation();
			case CONTENTPROFILEPackage.REFRAIN_POLICY_SECURITY_OBSERVATION:
				return createRefrainPolicySecurityObservation();
			case CONTENTPROFILEPackage.PURPOSE_OF_USE_SECURITY_OBSERVATION:
				return createPurposeOfUseSecurityObservation();
			case CONTENTPROFILEPackage.CONFIDENTIALITY_SECURITY_OBSERVATION:
				return createConfidentialitySecurityObservation();
			case CONTENTPROFILEPackage.PROTECTED_PROBLEM:
				return createProtectedProblem();
			case CONTENTPROFILEPackage.MANDATORY_ENTRY_PROVENANCE:
				return createMandatoryEntryProvenance();
			case CONTENTPROFILEPackage.MANDATORY_ENTRY_ASSIGNED_AUTHOR:
				return createMandatoryEntryAssignedAuthor();
			case CONTENTPROFILEPackage.PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP:
				return createPrivacyAnnotationEntryRelationship();
			case CONTENTPROFILEPackage.PRIVACY_MARKINGS_ENTRY:
				return createPrivacyMarkingsEntry();
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
	public PrivacySegmentedDocument createPrivacySegmentedDocument() {
		PrivacySegmentedDocumentImpl privacySegmentedDocument = new PrivacySegmentedDocumentImpl();
		return privacySegmentedDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivacySegmentedSection createPrivacySegmentedSection() {
		PrivacySegmentedSectionImpl privacySegmentedSection = new PrivacySegmentedSectionImpl();
		return privacySegmentedSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivacyMarkingsSection createPrivacyMarkingsSection() {
		PrivacyMarkingsSectionImpl privacyMarkingsSection = new PrivacyMarkingsSectionImpl();
		return privacyMarkingsSection;
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
	public MandatoryDocumentProvenance createMandatoryDocumentProvenance() {
		MandatoryDocumentProvenanceImpl mandatoryDocumentProvenance = new MandatoryDocumentProvenanceImpl();
		return mandatoryDocumentProvenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MandatoryDocumentAssignedAuthor createMandatoryDocumentAssignedAuthor() {
		MandatoryDocumentAssignedAuthorImpl mandatoryDocumentAssignedAuthor = new MandatoryDocumentAssignedAuthorImpl();
		return mandatoryDocumentAssignedAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivacyAnnotation createPrivacyAnnotation() {
		PrivacyAnnotationImpl privacyAnnotation = new PrivacyAnnotationImpl();
		return privacyAnnotation;
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
	public ProtectedProblem createProtectedProblem() {
		ProtectedProblemImpl protectedProblem = new ProtectedProblemImpl();
		return protectedProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MandatoryEntryProvenance createMandatoryEntryProvenance() {
		MandatoryEntryProvenanceImpl mandatoryEntryProvenance = new MandatoryEntryProvenanceImpl();
		return mandatoryEntryProvenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MandatoryEntryAssignedAuthor createMandatoryEntryAssignedAuthor() {
		MandatoryEntryAssignedAuthorImpl mandatoryEntryAssignedAuthor = new MandatoryEntryAssignedAuthorImpl();
		return mandatoryEntryAssignedAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivacyAnnotationEntryRelationship createPrivacyAnnotationEntryRelationship() {
		PrivacyAnnotationEntryRelationshipImpl privacyAnnotationEntryRelationship = new PrivacyAnnotationEntryRelationshipImpl();
		return privacyAnnotationEntryRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivacyMarkingsEntry createPrivacyMarkingsEntry() {
		PrivacyMarkingsEntryImpl privacyMarkingsEntry = new PrivacyMarkingsEntryImpl();
		return privacyMarkingsEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CONTENTPROFILEPackage getCONTENTPROFILEPackage() {
		return (CONTENTPROFILEPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CONTENTPROFILEPackage getPackage() {
		return CONTENTPROFILEPackage.eINSTANCE;
	}

} // CONTENTPROFILEFactoryImpl
