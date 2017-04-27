/**
 */
package org.hl7.security.ds4p.contentprofile.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.hl7.security.ds4p.contentprofile.*;

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
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.PRIVACY_SEGMENTED_SECTION: {
				PrivacySegmentedSection privacySegmentedSection = (PrivacySegmentedSection)theEObject;
				T result = casePrivacySegmentedSection(privacySegmentedSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.PRIVACY_MARKINGS_SECTION: {
				PrivacyMarkingsSection privacyMarkingsSection = (PrivacyMarkingsSection)theEObject;
				T result = casePrivacyMarkingsSection(privacyMarkingsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.OBLIGATION_POLICY_SECURITY_OBSERVATION: {
				ObligationPolicySecurityObservation obligationPolicySecurityObservation = (ObligationPolicySecurityObservation)theEObject;
				T result = caseObligationPolicySecurityObservation(obligationPolicySecurityObservation);
				if (result == null) result = caseSecurityObservation(obligationPolicySecurityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.SECURITY_OBSERVATION: {
				SecurityObservation securityObservation = (SecurityObservation)theEObject;
				T result = caseSecurityObservation(securityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.MANDATORY_DOCUMENT_PROVENANCE: {
				MandatoryDocumentProvenance mandatoryDocumentProvenance = (MandatoryDocumentProvenance)theEObject;
				T result = caseMandatoryDocumentProvenance(mandatoryDocumentProvenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.MANDATORY_DOCUMENT_ASSIGNED_AUTHOR: {
				MandatoryDocumentAssignedAuthor mandatoryDocumentAssignedAuthor = (MandatoryDocumentAssignedAuthor)theEObject;
				T result = caseMandatoryDocumentAssignedAuthor(mandatoryDocumentAssignedAuthor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.PRIVACY_ANNOTATION: {
				PrivacyAnnotation privacyAnnotation = (PrivacyAnnotation)theEObject;
				T result = casePrivacyAnnotation(privacyAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.REFRAIN_POLICY_SECURITY_OBSERVATION: {
				RefrainPolicySecurityObservation refrainPolicySecurityObservation = (RefrainPolicySecurityObservation)theEObject;
				T result = caseRefrainPolicySecurityObservation(refrainPolicySecurityObservation);
				if (result == null) result = caseSecurityObservation(refrainPolicySecurityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.PURPOSE_OF_USE_SECURITY_OBSERVATION: {
				PurposeOfUseSecurityObservation purposeOfUseSecurityObservation = (PurposeOfUseSecurityObservation)theEObject;
				T result = casePurposeOfUseSecurityObservation(purposeOfUseSecurityObservation);
				if (result == null) result = caseSecurityObservation(purposeOfUseSecurityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.CONFIDENTIALITY_SECURITY_OBSERVATION: {
				ConfidentialitySecurityObservation confidentialitySecurityObservation = (ConfidentialitySecurityObservation)theEObject;
				T result = caseConfidentialitySecurityObservation(confidentialitySecurityObservation);
				if (result == null) result = caseSecurityObservation(confidentialitySecurityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.PROTECTED_PROBLEM: {
				ProtectedProblem protectedProblem = (ProtectedProblem)theEObject;
				T result = caseProtectedProblem(protectedProblem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.MANDATORY_ENTRY_PROVENANCE: {
				MandatoryEntryProvenance mandatoryEntryProvenance = (MandatoryEntryProvenance)theEObject;
				T result = caseMandatoryEntryProvenance(mandatoryEntryProvenance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.MANDATORY_ENTRY_ASSIGNED_AUTHOR: {
				MandatoryEntryAssignedAuthor mandatoryEntryAssignedAuthor = (MandatoryEntryAssignedAuthor)theEObject;
				T result = caseMandatoryEntryAssignedAuthor(mandatoryEntryAssignedAuthor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP: {
				PrivacyAnnotationEntryRelationship privacyAnnotationEntryRelationship = (PrivacyAnnotationEntryRelationship)theEObject;
				T result = casePrivacyAnnotationEntryRelationship(privacyAnnotationEntryRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONTENTPROFILEPackage.PRIVACY_MARKINGS_ENTRY: {
				PrivacyMarkingsEntry privacyMarkingsEntry = (PrivacyMarkingsEntry)theEObject;
				T result = casePrivacyMarkingsEntry(privacyMarkingsEntry);
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
