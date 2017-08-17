/**
 */
package org.hl7.cbcc.privacy.consentdirective.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.mdht.uml.cda.Author;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.ClinicalStatement;
import org.eclipse.mdht.uml.cda.DocumentationOf;
import org.eclipse.mdht.uml.cda.Entry;
import org.eclipse.mdht.uml.cda.Observation;
import org.eclipse.mdht.uml.cda.ObservationMedia;
import org.eclipse.mdht.uml.cda.Organizer;
import org.eclipse.mdht.uml.cda.Participant2;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.hl7.rim.Act;
import org.eclipse.mdht.uml.hl7.rim.ActRelationship;
import org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot;
import org.eclipse.mdht.uml.hl7.rim.Participation;
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
 * @see org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage
 * @generated
 */
public class CONSENTDIRECTIVESwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CONSENTDIRECTIVEPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSENTDIRECTIVESwitch() {
		if (modelPackage == null) {
			modelPackage = CONSENTDIRECTIVEPackage.eINSTANCE;
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
			case CONSENTDIRECTIVEPackage.PRIVACY_CONSENT_HEADER_AUTHOR: {
				PrivacyConsentHeaderAuthor privacyConsentHeaderAuthor = (PrivacyConsentHeaderAuthor)theEObject;
				T result = casePrivacyConsentHeaderAuthor(privacyConsentHeaderAuthor);
				if (result == null) result = caseAuthor(privacyConsentHeaderAuthor);
				if (result == null) result = caseParticipation(privacyConsentHeaderAuthor);
				if (result == null) result = caseInfrastructureRoot(privacyConsentHeaderAuthor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF_SERVICE_EVENT: {
				PrivacyConsentHeaderDocumentationOfServiceEvent privacyConsentHeaderDocumentationOfServiceEvent = (PrivacyConsentHeaderDocumentationOfServiceEvent)theEObject;
				T result = casePrivacyConsentHeaderDocumentationOfServiceEvent(privacyConsentHeaderDocumentationOfServiceEvent);
				if (result == null) result = caseServiceEvent(privacyConsentHeaderDocumentationOfServiceEvent);
				if (result == null) result = caseAct(privacyConsentHeaderDocumentationOfServiceEvent);
				if (result == null) result = caseInfrastructureRoot(privacyConsentHeaderDocumentationOfServiceEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.PRIVACY_CONSENT_DIRECTIVE_DOCUMENT: {
				PrivacyConsentDirectiveDocument privacyConsentDirectiveDocument = (PrivacyConsentDirectiveDocument)theEObject;
				T result = casePrivacyConsentDirectiveDocument(privacyConsentDirectiveDocument);
				if (result == null) result = caseClinicalDocument(privacyConsentDirectiveDocument);
				if (result == null) result = caseAct(privacyConsentDirectiveDocument);
				if (result == null) result = caseInfrastructureRoot(privacyConsentDirectiveDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.PRIVACY_CONSENT_DETAILS_SECTION: {
				PrivacyConsentDetailsSection privacyConsentDetailsSection = (PrivacyConsentDetailsSection)theEObject;
				T result = casePrivacyConsentDetailsSection(privacyConsentDetailsSection);
				if (result == null) result = caseSection(privacyConsentDetailsSection);
				if (result == null) result = caseAct(privacyConsentDetailsSection);
				if (result == null) result = caseInfrastructureRoot(privacyConsentDetailsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.SIGNATURES_SECTION: {
				SignaturesSection signaturesSection = (SignaturesSection)theEObject;
				T result = caseSignaturesSection(signaturesSection);
				if (result == null) result = caseSection(signaturesSection);
				if (result == null) result = caseAct(signaturesSection);
				if (result == null) result = caseInfrastructureRoot(signaturesSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.CONSENT_DIRECTIVE_ENTRY: {
				ConsentDirectiveEntry consentDirectiveEntry = (ConsentDirectiveEntry)theEObject;
				T result = caseConsentDirectiveEntry(consentDirectiveEntry);
				if (result == null) result = caseEntry(consentDirectiveEntry);
				if (result == null) result = caseActRelationship(consentDirectiveEntry);
				if (result == null) result = caseInfrastructureRoot(consentDirectiveEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION: {
				ConsentDirectiveStructuredDefinition consentDirectiveStructuredDefinition = (ConsentDirectiveStructuredDefinition)theEObject;
				T result = caseConsentDirectiveStructuredDefinition(consentDirectiveStructuredDefinition);
				if (result == null) result = caseCDA_Act(consentDirectiveStructuredDefinition);
				if (result == null) result = caseClinicalStatement(consentDirectiveStructuredDefinition);
				if (result == null) result = caseAct(consentDirectiveStructuredDefinition);
				if (result == null) result = caseInfrastructureRoot(consentDirectiveStructuredDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.CONSENT_ACTION: {
				ConsentAction consentAction = (ConsentAction)theEObject;
				T result = caseConsentAction(consentAction);
				if (result == null) result = caseCDA_Act(consentAction);
				if (result == null) result = caseClinicalStatement(consentAction);
				if (result == null) result = caseAct(consentAction);
				if (result == null) result = caseInfrastructureRoot(consentAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.INFORMATION_CRITERIA_REFERENCES_ORGANIZER: {
				InformationCriteriaReferencesOrganizer informationCriteriaReferencesOrganizer = (InformationCriteriaReferencesOrganizer)theEObject;
				T result = caseInformationCriteriaReferencesOrganizer(informationCriteriaReferencesOrganizer);
				if (result == null) result = caseOrganizer(informationCriteriaReferencesOrganizer);
				if (result == null) result = caseClinicalStatement(informationCriteriaReferencesOrganizer);
				if (result == null) result = caseAct(informationCriteriaReferencesOrganizer);
				if (result == null) result = caseInfrastructureRoot(informationCriteriaReferencesOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.CRITERIUM_INFORMATION_DEFINITION: {
				CriteriumInformationDefinition criteriumInformationDefinition = (CriteriumInformationDefinition)theEObject;
				T result = caseCriteriumInformationDefinition(criteriumInformationDefinition);
				if (result == null) result = caseObservation(criteriumInformationDefinition);
				if (result == null) result = caseClinicalStatement(criteriumInformationDefinition);
				if (result == null) result = caseAct(criteriumInformationDefinition);
				if (result == null) result = caseInfrastructureRoot(criteriumInformationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.CRITERIUM_RELATED_PROTECTED_PROBLEM: {
				CriteriumRelatedProtectedProblem criteriumRelatedProtectedProblem = (CriteriumRelatedProtectedProblem)theEObject;
				T result = caseCriteriumRelatedProtectedProblem(criteriumRelatedProtectedProblem);
				if (result == null) result = caseObservation(criteriumRelatedProtectedProblem);
				if (result == null) result = caseClinicalStatement(criteriumRelatedProtectedProblem);
				if (result == null) result = caseAct(criteriumRelatedProtectedProblem);
				if (result == null) result = caseInfrastructureRoot(criteriumRelatedProtectedProblem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.CONFIDENTIALITY_SECURITY_OBSERVATION: {
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
			case CONSENTDIRECTIVEPackage.SECURITY_OBSERVATION: {
				SecurityObservation securityObservation = (SecurityObservation)theEObject;
				T result = caseSecurityObservation(securityObservation);
				if (result == null) result = caseObservation(securityObservation);
				if (result == null) result = caseClinicalStatement(securityObservation);
				if (result == null) result = caseAct(securityObservation);
				if (result == null) result = caseInfrastructureRoot(securityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.SECURITY_LABEL: {
				SecurityLabel securityLabel = (SecurityLabel)theEObject;
				T result = caseSecurityLabel(securityLabel);
				if (result == null) result = caseOrganizer(securityLabel);
				if (result == null) result = caseClinicalStatement(securityLabel);
				if (result == null) result = caseAct(securityLabel);
				if (result == null) result = caseInfrastructureRoot(securityLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.IIHI_RECEIVING_PROVIDER: {
				IIHIReceivingProvider iihiReceivingProvider = (IIHIReceivingProvider)theEObject;
				T result = caseIIHIReceivingProvider(iihiReceivingProvider);
				if (result == null) result = caseParticipant2(iihiReceivingProvider);
				if (result == null) result = caseParticipation(iihiReceivingProvider);
				if (result == null) result = caseInfrastructureRoot(iihiReceivingProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.OBLIGATION_POLICY_SECURITY_OBSERVATION: {
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
			case CONSENTDIRECTIVEPackage.COMPUTABLE_POLICY_CONSENT: {
				ComputablePolicyConsent computablePolicyConsent = (ComputablePolicyConsent)theEObject;
				T result = caseComputablePolicyConsent(computablePolicyConsent);
				if (result == null) result = caseObservation(computablePolicyConsent);
				if (result == null) result = caseClinicalStatement(computablePolicyConsent);
				if (result == null) result = caseAct(computablePolicyConsent);
				if (result == null) result = caseInfrastructureRoot(computablePolicyConsent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.SCANNED_PRIVACY_CONSENT: {
				ScannedPrivacyConsent scannedPrivacyConsent = (ScannedPrivacyConsent)theEObject;
				T result = caseScannedPrivacyConsent(scannedPrivacyConsent);
				if (result == null) result = caseObservationMedia(scannedPrivacyConsent);
				if (result == null) result = caseClinicalStatement(scannedPrivacyConsent);
				if (result == null) result = caseAct(scannedPrivacyConsent);
				if (result == null) result = caseInfrastructureRoot(scannedPrivacyConsent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.SIGNATURE_IMAGE_OBSERVATION: {
				SignatureImageObservation signatureImageObservation = (SignatureImageObservation)theEObject;
				T result = caseSignatureImageObservation(signatureImageObservation);
				if (result == null) result = caseObservationMedia(signatureImageObservation);
				if (result == null) result = caseClinicalStatement(signatureImageObservation);
				if (result == null) result = caseAct(signatureImageObservation);
				if (result == null) result = caseInfrastructureRoot(signatureImageObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.SIGNATURE_IMAGE_ENTRY: {
				SignatureImageEntry signatureImageEntry = (SignatureImageEntry)theEObject;
				T result = caseSignatureImageEntry(signatureImageEntry);
				if (result == null) result = caseEntry(signatureImageEntry);
				if (result == null) result = caseActRelationship(signatureImageEntry);
				if (result == null) result = caseInfrastructureRoot(signatureImageEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.PRIVACY_CONSENT_HEADER_DOCUMENTATION_OF: {
				PrivacyConsentHeaderDocumentationOf privacyConsentHeaderDocumentationOf = (PrivacyConsentHeaderDocumentationOf)theEObject;
				T result = casePrivacyConsentHeaderDocumentationOf(privacyConsentHeaderDocumentationOf);
				if (result == null) result = caseDocumentationOf(privacyConsentHeaderDocumentationOf);
				if (result == null) result = caseActRelationship(privacyConsentHeaderDocumentationOf);
				if (result == null) result = caseInfrastructureRoot(privacyConsentHeaderDocumentationOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CONSENTDIRECTIVEPackage.PURPOSE_OF_USE_SECURITY_OBSERVATION: {
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
			case CONSENTDIRECTIVEPackage.REFRAIN_POLICY_SECURITY_OBSERVATION: {
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
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privacy Consent Header Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privacy Consent Header Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivacyConsentHeaderAuthor(PrivacyConsentHeaderAuthor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privacy Consent Header Documentation Of Service Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privacy Consent Header Documentation Of Service Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivacyConsentHeaderDocumentationOfServiceEvent(PrivacyConsentHeaderDocumentationOfServiceEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privacy Consent Directive Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privacy Consent Directive Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivacyConsentDirectiveDocument(PrivacyConsentDirectiveDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privacy Consent Details Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privacy Consent Details Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivacyConsentDetailsSection(PrivacyConsentDetailsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Directive Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Directive Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentDirectiveEntry(ConsentDirectiveEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signatures Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signatures Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignaturesSection(SignaturesSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature Image Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature Image Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignatureImageEntry(SignatureImageEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Directive Structured Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Directive Structured Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentDirectiveStructuredDefinition(ConsentDirectiveStructuredDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsentAction(ConsentAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Criteria References Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Criteria References Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationCriteriaReferencesOrganizer(InformationCriteriaReferencesOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criterium Information Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criterium Information Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriteriumInformationDefinition(CriteriumInformationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criterium Related Protected Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criterium Related Protected Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriteriumRelatedProtectedProblem(CriteriumRelatedProtectedProblem object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Security Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityLabel(SecurityLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IIHI Receiving Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IIHI Receiving Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIIHIReceivingProvider(IIHIReceivingProvider object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Computable Policy Consent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computable Policy Consent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputablePolicyConsent(ComputablePolicyConsent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scanned Privacy Consent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scanned Privacy Consent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScannedPrivacyConsent(ScannedPrivacyConsent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature Image Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature Image Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignatureImageObservation(SignatureImageObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privacy Consent Header Documentation Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privacy Consent Header Documentation Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivacyConsentHeaderDocumentationOf(PrivacyConsentHeaderDocumentationOf object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Service Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceEvent(ServiceEvent object) {
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
	public T caseCDA_Act(org.eclipse.mdht.uml.cda.Act object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Participant2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant2(Participant2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationMedia(ObservationMedia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentationOf(DocumentationOf object) {
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

} //CONSENTDIRECTIVESwitch
