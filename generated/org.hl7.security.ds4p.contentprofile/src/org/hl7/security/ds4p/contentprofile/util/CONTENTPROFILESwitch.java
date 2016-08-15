/**
 */
package org.hl7.security.ds4p.contentprofile.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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

import org.hl7.security.ds4p.contentprofile.*;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage
 * @generated
 */
public class CONTENTPROFILESwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CONTENTPROFILEPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTENTPROFILESwitch() {
		if (modelPackage == null) {
			modelPackage = CONTENTPROFILEPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CONTENTPROFILEPackage.PRIVACY_SEGMENTED_DOCUMENT: {
				PrivacySegmentedDocument privacySegmentedDocument = (PrivacySegmentedDocument)theEObject;
				T result = casePrivacySegmentedDocument(privacySegmentedDocument);
				if (result == null) result = caseGeneralHeaderConstraints(privacySegmentedDocument);
				if (result == null) result = caseClinicalDocument(privacySegmentedDocument);
				if (result == null) result = caseAct(privacySegmentedDocument);
				if (result == null) result = caseInfrastructureRoot(privacySegmentedDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.PRIVACY_SEGMENTED_SECTION: {
				PrivacySegmentedSection privacySegmentedSection = (PrivacySegmentedSection)theEObject;
				T result = casePrivacySegmentedSection(privacySegmentedSection);
				if (result == null) result = caseSection(privacySegmentedSection);
				if (result == null) result = caseAct(privacySegmentedSection);
				if (result == null) result = caseInfrastructureRoot(privacySegmentedSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.PRIVACY_MARKINGS_SECTION: {
				PrivacyMarkingsSection privacyMarkingsSection = (PrivacyMarkingsSection)theEObject;
				T result = casePrivacyMarkingsSection(privacyMarkingsSection);
				if (result == null) result = caseSection(privacyMarkingsSection);
				if (result == null) result = caseAct(privacyMarkingsSection);
				if (result == null) result = caseInfrastructureRoot(privacyMarkingsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.OBLIGATION_POLICY_SECURITY_OBSERVATION: {
				ObligationPolicySecurityObservation obligationPolicySecurityObservation = (ObligationPolicySecurityObservation)theEObject;
				T result = caseObligationPolicySecurityObservation(obligationPolicySecurityObservation);
				if (result == null) result = caseSecurityObservation(obligationPolicySecurityObservation);
				if (result == null) result = caseObservation(obligationPolicySecurityObservation);
				if (result == null) result = caseClinicalStatement(obligationPolicySecurityObservation);
				if (result == null) result = caseAct(obligationPolicySecurityObservation);
				if (result == null) result = caseInfrastructureRoot(obligationPolicySecurityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.SECURITY_OBSERVATION: {
				SecurityObservation securityObservation = (SecurityObservation)theEObject;
				T result = caseSecurityObservation(securityObservation);
				if (result == null) result = caseObservation(securityObservation);
				if (result == null) result = caseClinicalStatement(securityObservation);
				if (result == null) result = caseAct(securityObservation);
				if (result == null) result = caseInfrastructureRoot(securityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.MANDATORY_DOCUMENT_PROVENANCE: {
				MandatoryDocumentProvenance mandatoryDocumentProvenance = (MandatoryDocumentProvenance)theEObject;
				T result = caseMandatoryDocumentProvenance(mandatoryDocumentProvenance);
				if (result == null) result = caseAuthor(mandatoryDocumentProvenance);
				if (result == null) result = caseParticipation(mandatoryDocumentProvenance);
				if (result == null) result = caseInfrastructureRoot(mandatoryDocumentProvenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.MANDATORY_DOCUMENT_ASSIGNED_AUTHOR: {
				MandatoryDocumentAssignedAuthor mandatoryDocumentAssignedAuthor = (MandatoryDocumentAssignedAuthor)theEObject;
				T result = caseMandatoryDocumentAssignedAuthor(mandatoryDocumentAssignedAuthor);
				if (result == null) result = caseAssignedAuthor(mandatoryDocumentAssignedAuthor);
				if (result == null) result = caseRole(mandatoryDocumentAssignedAuthor);
				if (result == null) result = caseInfrastructureRoot(mandatoryDocumentAssignedAuthor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.PRIVACY_ANNOTATION: {
				PrivacyAnnotation privacyAnnotation = (PrivacyAnnotation)theEObject;
				T result = casePrivacyAnnotation(privacyAnnotation);
				if (result == null) result = caseOrganizer(privacyAnnotation);
				if (result == null) result = caseClinicalStatement(privacyAnnotation);
				if (result == null) result = caseAct(privacyAnnotation);
				if (result == null) result = caseInfrastructureRoot(privacyAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.REFRAIN_POLICY_SECURITY_OBSERVATION: {
				RefrainPolicySecurityObservation refrainPolicySecurityObservation = (RefrainPolicySecurityObservation)theEObject;
				T result = caseRefrainPolicySecurityObservation(refrainPolicySecurityObservation);
				if (result == null) result = caseSecurityObservation(refrainPolicySecurityObservation);
				if (result == null) result = caseObservation(refrainPolicySecurityObservation);
				if (result == null) result = caseClinicalStatement(refrainPolicySecurityObservation);
				if (result == null) result = caseAct(refrainPolicySecurityObservation);
				if (result == null) result = caseInfrastructureRoot(refrainPolicySecurityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.PURPOSE_OF_USE_SECURITY_OBSERVATION: {
				PurposeOfUseSecurityObservation purposeOfUseSecurityObservation = (PurposeOfUseSecurityObservation)theEObject;
				T result = casePurposeOfUseSecurityObservation(purposeOfUseSecurityObservation);
				if (result == null) result = caseSecurityObservation(purposeOfUseSecurityObservation);
				if (result == null) result = caseObservation(purposeOfUseSecurityObservation);
				if (result == null) result = caseClinicalStatement(purposeOfUseSecurityObservation);
				if (result == null) result = caseAct(purposeOfUseSecurityObservation);
				if (result == null) result = caseInfrastructureRoot(purposeOfUseSecurityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.CONFIDENTIALITY_SECURITY_OBSERVATION: {
				ConfidentialitySecurityObservation confidentialitySecurityObservation = (ConfidentialitySecurityObservation)theEObject;
				T result = caseConfidentialitySecurityObservation(confidentialitySecurityObservation);
				if (result == null) result = caseSecurityObservation(confidentialitySecurityObservation);
				if (result == null) result = caseObservation(confidentialitySecurityObservation);
				if (result == null) result = caseClinicalStatement(confidentialitySecurityObservation);
				if (result == null) result = caseAct(confidentialitySecurityObservation);
				if (result == null) result = caseInfrastructureRoot(confidentialitySecurityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.PROTECTED_PROBLEM: {
				ProtectedProblem protectedProblem = (ProtectedProblem)theEObject;
				T result = caseProtectedProblem(protectedProblem);
				if (result == null) result = caseProblemObservation(protectedProblem);
				if (result == null) result = caseObservation(protectedProblem);
				if (result == null) result = caseClinicalStatement(protectedProblem);
				if (result == null) result = caseAct(protectedProblem);
				if (result == null) result = caseInfrastructureRoot(protectedProblem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.MANDATORY_ENTRY_PROVENANCE: {
				MandatoryEntryProvenance mandatoryEntryProvenance = (MandatoryEntryProvenance)theEObject;
				T result = caseMandatoryEntryProvenance(mandatoryEntryProvenance);
				if (result == null) result = caseAuthor(mandatoryEntryProvenance);
				if (result == null) result = caseParticipation(mandatoryEntryProvenance);
				if (result == null) result = caseInfrastructureRoot(mandatoryEntryProvenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.MANDATORY_ENTRY_ASSIGNED_AUTHOR: {
				MandatoryEntryAssignedAuthor mandatoryEntryAssignedAuthor = (MandatoryEntryAssignedAuthor)theEObject;
				T result = caseMandatoryEntryAssignedAuthor(mandatoryEntryAssignedAuthor);
				if (result == null) result = caseAssignedAuthor(mandatoryEntryAssignedAuthor);
				if (result == null) result = caseRole(mandatoryEntryAssignedAuthor);
				if (result == null) result = caseInfrastructureRoot(mandatoryEntryAssignedAuthor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP: {
				PrivacyAnnotationEntryRelationship privacyAnnotationEntryRelationship = (PrivacyAnnotationEntryRelationship)theEObject;
				T result = casePrivacyAnnotationEntryRelationship(privacyAnnotationEntryRelationship);
				if (result == null) result = caseEntryRelationship(privacyAnnotationEntryRelationship);
				if (result == null) result = caseActRelationship(privacyAnnotationEntryRelationship);
				if (result == null) result = caseInfrastructureRoot(privacyAnnotationEntryRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.PRIVACY_MARKINGS_ENTRY: {
				PrivacyMarkingsEntry privacyMarkingsEntry = (PrivacyMarkingsEntry)theEObject;
				T result = casePrivacyMarkingsEntry(privacyMarkingsEntry);
				if (result == null) result = caseEntry(privacyMarkingsEntry);
				if (result == null) result = caseActRelationship(privacyMarkingsEntry);
				if (result == null) result = caseInfrastructureRoot(privacyMarkingsEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privacy Segmented Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privacy Segmented Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivacySegmentedDocument(PrivacySegmentedDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privacy Segmented Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privacy Segmented Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivacySegmentedSection(PrivacySegmentedSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privacy Markings Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privacy Markings Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivacyMarkingsSection(PrivacyMarkingsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obligation Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obligation Policy Security Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObligationPolicySecurityObservation(ObligationPolicySecurityObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityObservation(SecurityObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory Document Provenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory Document Provenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatoryDocumentProvenance(MandatoryDocumentProvenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory Document Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory Document Assigned Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatoryDocumentAssignedAuthor(MandatoryDocumentAssignedAuthor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privacy Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privacy Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivacyAnnotation(PrivacyAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refrain Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refrain Policy Security Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefrainPolicySecurityObservation(RefrainPolicySecurityObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purpose Of Use Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purpose Of Use Security Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurposeOfUseSecurityObservation(PurposeOfUseSecurityObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confidentiality Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confidentiality Security Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfidentialitySecurityObservation(ConfidentialitySecurityObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protected Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protected Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtectedProblem(ProtectedProblem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory Entry Provenance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory Entry Provenance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatoryEntryProvenance(MandatoryEntryProvenance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory Entry Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory Entry Assigned Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatoryEntryAssignedAuthor(MandatoryEntryAssignedAuthor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privacy Annotation Entry Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privacy Annotation Entry Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivacyAnnotationEntryRelationship(PrivacyAnnotationEntryRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privacy Markings Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privacy Markings Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivacyMarkingsEntry(PrivacyMarkingsEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureRoot(InfrastructureRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAct(Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalDocument(ClinicalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalStatement(ClinicalStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizer(Organizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemObservation(ProblemObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipation(Participation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthor(Author object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedAuthor(AssignedAuthor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActRelationship(ActRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryRelationship(EntryRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntry(Entry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CONTENTPROFILESwitch
