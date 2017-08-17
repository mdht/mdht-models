/**
 */
package org.hl7.cbcc.privacy.consentdirective.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage
 * @generated
 */
public class CONSENTDIRECTIVEAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CONSENTDIRECTIVEPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSENTDIRECTIVEAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CONSENTDIRECTIVEPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONSENTDIRECTIVESwitch<Adapter> modelSwitch =
		new CONSENTDIRECTIVESwitch<Adapter>() {
			@Override
			public Adapter casePrivacyConsentHeaderAuthor(PrivacyConsentHeaderAuthor object) {
				return createPrivacyConsentHeaderAuthorAdapter();
			}
			@Override
			public Adapter casePrivacyConsentHeaderDocumentationOfServiceEvent(PrivacyConsentHeaderDocumentationOfServiceEvent object) {
				return createPrivacyConsentHeaderDocumentationOfServiceEventAdapter();
			}
			@Override
			public Adapter casePrivacyConsentDirectiveDocument(PrivacyConsentDirectiveDocument object) {
				return createPrivacyConsentDirectiveDocumentAdapter();
			}
			@Override
			public Adapter casePrivacyConsentDetailsSection(PrivacyConsentDetailsSection object) {
				return createPrivacyConsentDetailsSectionAdapter();
			}
			@Override
			public Adapter caseSignaturesSection(SignaturesSection object) {
				return createSignaturesSectionAdapter();
			}
			@Override
			public Adapter caseConsentDirectiveEntry(ConsentDirectiveEntry object) {
				return createConsentDirectiveEntryAdapter();
			}
			@Override
			public Adapter caseConsentDirectiveStructuredDefinition(ConsentDirectiveStructuredDefinition object) {
				return createConsentDirectiveStructuredDefinitionAdapter();
			}
			@Override
			public Adapter caseConsentAction(ConsentAction object) {
				return createConsentActionAdapter();
			}
			@Override
			public Adapter caseInformationCriteriaReferencesOrganizer(InformationCriteriaReferencesOrganizer object) {
				return createInformationCriteriaReferencesOrganizerAdapter();
			}
			@Override
			public Adapter caseCriteriumInformationDefinition(CriteriumInformationDefinition object) {
				return createCriteriumInformationDefinitionAdapter();
			}
			@Override
			public Adapter caseCriteriumRelatedProtectedProblem(CriteriumRelatedProtectedProblem object) {
				return createCriteriumRelatedProtectedProblemAdapter();
			}
			@Override
			public Adapter caseConfidentialitySecurityObservation(ConfidentialitySecurityObservation object) {
				return createConfidentialitySecurityObservationAdapter();
			}
			@Override
			public Adapter caseSecurityObservation(SecurityObservation object) {
				return createSecurityObservationAdapter();
			}
			@Override
			public Adapter caseSecurityLabel(SecurityLabel object) {
				return createSecurityLabelAdapter();
			}
			@Override
			public Adapter caseIIHIReceivingProvider(IIHIReceivingProvider object) {
				return createIIHIReceivingProviderAdapter();
			}
			@Override
			public Adapter caseObligationPolicySecurityObservation(ObligationPolicySecurityObservation object) {
				return createObligationPolicySecurityObservationAdapter();
			}
			@Override
			public Adapter caseComputablePolicyConsent(ComputablePolicyConsent object) {
				return createComputablePolicyConsentAdapter();
			}
			@Override
			public Adapter caseScannedPrivacyConsent(ScannedPrivacyConsent object) {
				return createScannedPrivacyConsentAdapter();
			}
			@Override
			public Adapter caseSignatureImageObservation(SignatureImageObservation object) {
				return createSignatureImageObservationAdapter();
			}
			@Override
			public Adapter caseSignatureImageEntry(SignatureImageEntry object) {
				return createSignatureImageEntryAdapter();
			}
			@Override
			public Adapter casePrivacyConsentHeaderDocumentationOf(PrivacyConsentHeaderDocumentationOf object) {
				return createPrivacyConsentHeaderDocumentationOfAdapter();
			}
			@Override
			public Adapter casePurposeOfUseSecurityObservation(PurposeOfUseSecurityObservation object) {
				return createPurposeOfUseSecurityObservationAdapter();
			}
			@Override
			public Adapter caseRefrainPolicySecurityObservation(RefrainPolicySecurityObservation object) {
				return createRefrainPolicySecurityObservationAdapter();
			}
			@Override
			public Adapter caseInfrastructureRoot(InfrastructureRoot object) {
				return createInfrastructureRootAdapter();
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
			public Adapter caseAct(Act object) {
				return createActAdapter();
			}
			@Override
			public Adapter caseServiceEvent(ServiceEvent object) {
				return createServiceEventAdapter();
			}
			@Override
			public Adapter caseClinicalDocument(ClinicalDocument object) {
				return createClinicalDocumentAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseActRelationship(ActRelationship object) {
				return createActRelationshipAdapter();
			}
			@Override
			public Adapter caseEntry(Entry object) {
				return createEntryAdapter();
			}
			@Override
			public Adapter caseClinicalStatement(ClinicalStatement object) {
				return createClinicalStatementAdapter();
			}
			@Override
			public Adapter caseCDA_Act(org.eclipse.mdht.uml.cda.Act object) {
				return createCDA_ActAdapter();
			}
			@Override
			public Adapter caseOrganizer(Organizer object) {
				return createOrganizerAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseParticipant2(Participant2 object) {
				return createParticipant2Adapter();
			}
			@Override
			public Adapter caseObservationMedia(ObservationMedia object) {
				return createObservationMediaAdapter();
			}
			@Override
			public Adapter caseDocumentationOf(DocumentationOf object) {
				return createDocumentationOfAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderAuthor <em>Privacy Consent Header Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderAuthor
	 * @generated
	 */
	public Adapter createPrivacyConsentHeaderAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderDocumentationOfServiceEvent <em>Privacy Consent Header Documentation Of Service Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderDocumentationOfServiceEvent
	 * @generated
	 */
	public Adapter createPrivacyConsentHeaderDocumentationOfServiceEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument <em>Privacy Consent Directive Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDirectiveDocument
	 * @generated
	 */
	public Adapter createPrivacyConsentDirectiveDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDetailsSection <em>Privacy Consent Details Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentDetailsSection
	 * @generated
	 */
	public Adapter createPrivacyConsentDetailsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry <em>Consent Directive Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveEntry
	 * @generated
	 */
	public Adapter createConsentDirectiveEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.SignaturesSection <em>Signatures Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.SignaturesSection
	 * @generated
	 */
	public Adapter createSignaturesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.SignatureImageEntry <em>Signature Image Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.SignatureImageEntry
	 * @generated
	 */
	public Adapter createSignatureImageEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition <em>Consent Directive Structured Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition
	 * @generated
	 */
	public Adapter createConsentDirectiveStructuredDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.ConsentAction <em>Consent Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.ConsentAction
	 * @generated
	 */
	public Adapter createConsentActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer <em>Information Criteria References Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer
	 * @generated
	 */
	public Adapter createInformationCriteriaReferencesOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition <em>Criterium Information Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition
	 * @generated
	 */
	public Adapter createCriteriumInformationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.CriteriumRelatedProtectedProblem <em>Criterium Related Protected Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.CriteriumRelatedProtectedProblem
	 * @generated
	 */
	public Adapter createCriteriumRelatedProtectedProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.ConfidentialitySecurityObservation <em>Confidentiality Security Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.ConfidentialitySecurityObservation
	 * @generated
	 */
	public Adapter createConfidentialitySecurityObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.SecurityObservation <em>Security Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.SecurityObservation
	 * @generated
	 */
	public Adapter createSecurityObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.SecurityLabel <em>Security Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.SecurityLabel
	 * @generated
	 */
	public Adapter createSecurityLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.IIHIReceivingProvider <em>IIHI Receiving Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.IIHIReceivingProvider
	 * @generated
	 */
	public Adapter createIIHIReceivingProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.ObligationPolicySecurityObservation <em>Obligation Policy Security Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.ObligationPolicySecurityObservation
	 * @generated
	 */
	public Adapter createObligationPolicySecurityObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.ComputablePolicyConsent <em>Computable Policy Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.ComputablePolicyConsent
	 * @generated
	 */
	public Adapter createComputablePolicyConsentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsent <em>Scanned Privacy Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.ScannedPrivacyConsent
	 * @generated
	 */
	public Adapter createScannedPrivacyConsentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation <em>Signature Image Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.SignatureImageObservation
	 * @generated
	 */
	public Adapter createSignatureImageObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderDocumentationOf <em>Privacy Consent Header Documentation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.PrivacyConsentHeaderDocumentationOf
	 * @generated
	 */
	public Adapter createPrivacyConsentHeaderDocumentationOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.PurposeOfUseSecurityObservation <em>Purpose Of Use Security Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.PurposeOfUseSecurityObservation
	 * @generated
	 */
	public Adapter createPurposeOfUseSecurityObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.hl7.cbcc.privacy.consentdirective.RefrainPolicySecurityObservation <em>Refrain Policy Security Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.hl7.cbcc.privacy.consentdirective.RefrainPolicySecurityObservation
	 * @generated
	 */
	public Adapter createRefrainPolicySecurityObservationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.ServiceEvent <em>Service Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.ServiceEvent
	 * @generated
	 */
	public Adapter createServiceEventAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Act
	 * @generated
	 */
	public Adapter createCDA_ActAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Participant2 <em>Participant2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Participant2
	 * @generated
	 */
	public Adapter createParticipant2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.ObservationMedia <em>Observation Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.ObservationMedia
	 * @generated
	 */
	public Adapter createObservationMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.DocumentationOf <em>Documentation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.DocumentationOf
	 * @generated
	 */
	public Adapter createDocumentationOfAdapter() {
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

} //CONSENTDIRECTIVEAdapterFactory
