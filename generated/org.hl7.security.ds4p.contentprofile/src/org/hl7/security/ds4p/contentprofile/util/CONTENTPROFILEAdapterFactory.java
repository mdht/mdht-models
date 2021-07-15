/**
 */
package org.hl7.security.ds4p.contentprofile.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.AssignedAuthor;
import org.eclipse.mdht.uml.cda.Author;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.ClinicalStatement;
import org.eclipse.mdht.uml.cda.Entry;
import org.eclipse.mdht.uml.cda.EntryRelationship;
import org.eclipse.mdht.uml.cda.Observation;
import org.eclipse.mdht.uml.cda.Organizer;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.hl7.rim.Act;
import org.eclipse.mdht.uml.hl7.rim.ActRelationship;
import org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot;
import org.eclipse.mdht.uml.hl7.rim.Participation;
import org.eclipse.mdht.uml.hl7.rim.Role;
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
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage
 * @generated
 */
public class CONTENTPROFILEAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CONTENTPROFILEPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTENTPROFILEAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CONTENTPROFILEPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONTENTPROFILESwitch<Adapter> modelSwitch = new CONTENTPROFILESwitch<Adapter>() {
		@Override
		public Adapter casePrivacySegmentedDocument(PrivacySegmentedDocument object) {
			return createPrivacySegmentedDocumentAdapter();
		}

		@Override
		public Adapter casePrivacySegmentedSection(PrivacySegmentedSection object) {
			return createPrivacySegmentedSectionAdapter();
		}

		@Override
		public Adapter casePrivacyMarkingsSection(PrivacyMarkingsSection object) {
			return createPrivacyMarkingsSectionAdapter();
		}

		@Override
		public Adapter caseObligationPolicySecurityObservation(ObligationPolicySecurityObservation object) {
			return createObligationPolicySecurityObservationAdapter();
		}

		@Override
		public Adapter caseSecurityObservation(SecurityObservation object) {
			return createSecurityObservationAdapter();
		}

		@Override
		public Adapter caseMandatoryDocumentProvenance(MandatoryDocumentProvenance object) {
			return createMandatoryDocumentProvenanceAdapter();
		}

		@Override
		public Adapter caseMandatoryDocumentAssignedAuthor(MandatoryDocumentAssignedAuthor object) {
			return createMandatoryDocumentAssignedAuthorAdapter();
		}

		@Override
		public Adapter casePrivacyAnnotation(PrivacyAnnotation object) {
			return createPrivacyAnnotationAdapter();
		}

		@Override
		public Adapter caseRefrainPolicySecurityObservation(RefrainPolicySecurityObservation object) {
			return createRefrainPolicySecurityObservationAdapter();
		}

		@Override
		public Adapter casePurposeOfUseSecurityObservation(PurposeOfUseSecurityObservation object) {
			return createPurposeOfUseSecurityObservationAdapter();
		}

		@Override
		public Adapter caseConfidentialitySecurityObservation(ConfidentialitySecurityObservation object) {
			return createConfidentialitySecurityObservationAdapter();
		}

		@Override
		public Adapter caseProtectedProblem(ProtectedProblem object) {
			return createProtectedProblemAdapter();
		}

		@Override
		public Adapter caseMandatoryEntryProvenance(MandatoryEntryProvenance object) {
			return createMandatoryEntryProvenanceAdapter();
		}

		@Override
		public Adapter caseMandatoryEntryAssignedAuthor(MandatoryEntryAssignedAuthor object) {
			return createMandatoryEntryAssignedAuthorAdapter();
		}

		@Override
		public Adapter casePrivacyAnnotationEntryRelationship(PrivacyAnnotationEntryRelationship object) {
			return createPrivacyAnnotationEntryRelationshipAdapter();
		}

		@Override
		public Adapter casePrivacyMarkingsEntry(PrivacyMarkingsEntry object) {
			return createPrivacyMarkingsEntryAdapter();
		}

		@Override
		public Adapter caseInfrastructureRoot(InfrastructureRoot object) {
			return createInfrastructureRootAdapter();
		}

		@Override
		public Adapter caseAct(Act object) {
			return createActAdapter();
		}

		@Override
		public Adapter caseClinicalDocument(ClinicalDocument object) {
			return createClinicalDocumentAdapter();
		}

		@Override
		public Adapter caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
			return createGeneralHeaderConstraintsAdapter();
		}

		@Override
		public Adapter caseSection(Section object) {
			return createSectionAdapter();
		}

		@Override
		public Adapter caseClinicalStatement(ClinicalStatement object) {
			return createClinicalStatementAdapter();
		}

		@Override
		public Adapter caseObservation(Observation object) {
			return createObservationAdapter();
		}

		@Override
		public Adapter caseParticipation(Participation object) {
			return createParticipationAdapter();
		}

		@Override
		public Adapter caseAuthor(Author object) {
			return createAuthorAdapter();
		}

		@Override
		public Adapter caseRole(Role object) {
			return createRoleAdapter();
		}

		@Override
		public Adapter caseAssignedAuthor(AssignedAuthor object) {
			return createAssignedAuthorAdapter();
		}

		@Override
		public Adapter caseOrganizer(Organizer object) {
			return createOrganizerAdapter();
		}

		@Override
		public Adapter caseProblemObservation(ProblemObservation object) {
			return createProblemObservationAdapter();
		}

		@Override
		public Adapter caseActRelationship(ActRelationship object) {
			return createActRelationshipAdapter();
		}

		@Override
		public Adapter caseEntryRelationship(EntryRelationship object) {
			return createEntryRelationshipAdapter();
		}

		@Override
		public Adapter caseEntry(Entry object) {
			return createEntryAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument <em>Privacy Segmented Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.security.ds4p.contentprofile.PrivacySegmentedDocument
	 * @generated
	 */
	public Adapter createPrivacySegmentedDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection <em>Privacy Segmented Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection
	 * @generated
	 */
	public Adapter createPrivacySegmentedSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection <em>Privacy Markings Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection
	 * @generated
	 */
	public Adapter createPrivacyMarkingsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation <em>Obligation Policy Security Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation
	 * @generated
	 */
	public Adapter createObligationPolicySecurityObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.security.ds4p.contentprofile.SecurityObservation <em>Security Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.security.ds4p.contentprofile.SecurityObservation
	 * @generated
	 */
	public Adapter createSecurityObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentProvenance <em>Mandatory Document Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.security.ds4p.contentprofile.MandatoryDocumentProvenance
	 * @generated
	 */
	public Adapter createMandatoryDocumentProvenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor <em>Mandatory Document Assigned Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.security.ds4p.contentprofile.MandatoryDocumentAssignedAuthor
	 * @generated
	 */
	public Adapter createMandatoryDocumentAssignedAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation <em>Privacy Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.security.ds4p.contentprofile.PrivacyAnnotation
	 * @generated
	 */
	public Adapter createPrivacyAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation <em>Refrain Policy Security Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation
	 * @generated
	 */
	public Adapter createRefrainPolicySecurityObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation <em>Purpose Of Use Security Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation
	 * @generated
	 */
	public Adapter createPurposeOfUseSecurityObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.security.ds4p.contentprofile.ConfidentialitySecurityObservation <em>Confidentiality Security Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.security.ds4p.contentprofile.ConfidentialitySecurityObservation
	 * @generated
	 */
	public Adapter createConfidentialitySecurityObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.security.ds4p.contentprofile.ProtectedProblem <em>Protected Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.security.ds4p.contentprofile.ProtectedProblem
	 * @generated
	 */
	public Adapter createProtectedProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryProvenance <em>Mandatory Entry Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.security.ds4p.contentprofile.MandatoryEntryProvenance
	 * @generated
	 */
	public Adapter createMandatoryEntryProvenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.security.ds4p.contentprofile.MandatoryEntryAssignedAuthor <em>Mandatory Entry Assigned Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.security.ds4p.contentprofile.MandatoryEntryAssignedAuthor
	 * @generated
	 */
	public Adapter createMandatoryEntryAssignedAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotationEntryRelationship <em>Privacy Annotation Entry Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.security.ds4p.contentprofile.PrivacyAnnotationEntryRelationship
	 * @generated
	 */
	public Adapter createPrivacyAnnotationEntryRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsEntry <em>Privacy Markings Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.security.ds4p.contentprofile.PrivacyMarkingsEntry
	 * @generated
	 */
	public Adapter createPrivacyMarkingsEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot
	 * @generated
	 */
	public Adapter createInfrastructureRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.hl7.rim.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.hl7.rim.Act
	 * @generated
	 */
	public Adapter createActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.ClinicalDocument
	 * @generated
	 */
	public Adapter createClinicalDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints <em>General Header Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.ClinicalStatement <em>Clinical Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.ClinicalStatement
	 * @generated
	 */
	public Adapter createClinicalStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.hl7.rim.Participation <em>Participation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.hl7.rim.Participation
	 * @generated
	 */
	public Adapter createParticipationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Author
	 * @generated
	 */
	public Adapter createAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.hl7.rim.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.hl7.rim.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.AssignedAuthor <em>Assigned Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.AssignedAuthor
	 * @generated
	 */
	public Adapter createAssignedAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Organizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Organizer
	 * @generated
	 */
	public Adapter createOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation <em>Problem Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemObservation
	 * @generated
	 */
	public Adapter createProblemObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.hl7.rim.ActRelationship <em>Act Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.hl7.rim.ActRelationship
	 * @generated
	 */
	public Adapter createActRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.EntryRelationship <em>Entry Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.EntryRelationship
	 * @generated
	 */
	public Adapter createEntryRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Entry
	 * @generated
	 */
	public Adapter createEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // CONTENTPROFILEAdapterFactory
