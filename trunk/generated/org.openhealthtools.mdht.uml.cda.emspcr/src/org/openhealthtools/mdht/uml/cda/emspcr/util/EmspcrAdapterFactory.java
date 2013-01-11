/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.Section;

import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;

import org.openhealthtools.mdht.uml.cda.emspcr.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.ActRelationship;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage
 * @generated
 */
public class EmspcrAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static EmspcrPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EmspcrAdapterFactory() {
    if (modelPackage == null)
    {
      modelPackage = EmspcrPackage.eINSTANCE;
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
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
	protected EmspcrSwitch<Adapter> modelSwitch = new EmspcrSwitch<Adapter>()
    {
      @Override
      public Adapter casePatientCareReport(PatientCareReport object)
      {
        return createPatientCareReportAdapter();
      }
      @Override
      public Adapter caseEMSBillingSection(EMSBillingSection object)
      {
        return createEMSBillingSectionAdapter();
      }
      @Override
      public Adapter caseEMSInjuryIncidentDescriptionSection(EMSInjuryIncidentDescriptionSection object)
      {
        return createEMSInjuryIncidentDescriptionSectionAdapter();
      }
      @Override
      public Adapter caseEMSCurrentMedicationSection(EMSCurrentMedicationSection object)
      {
        return createEMSCurrentMedicationSectionAdapter();
      }
      @Override
      public Adapter caseEMSCardiacArrestEventSection(EMSCardiacArrestEventSection object)
      {
        return createEMSCardiacArrestEventSectionAdapter();
      }
      @Override
      public Adapter caseEMSAdvanceDirectivesSection(EMSAdvanceDirectivesSection object)
      {
        return createEMSAdvanceDirectivesSectionAdapter();
      }
      @Override
      public Adapter caseEMSAllergiesAndAdverseReactionsSection(EMSAllergiesAndAdverseReactionsSection object)
      {
        return createEMSAllergiesAndAdverseReactionsSectionAdapter();
      }
      @Override
      public Adapter caseEMSPastMedicalHistorySection(EMSPastMedicalHistorySection object)
      {
        return createEMSPastMedicalHistorySectionAdapter();
      }
      @Override
      public Adapter caseEMSSocialHistorySection(EMSSocialHistorySection object)
      {
        return createEMSSocialHistorySectionAdapter();
      }
      @Override
      public Adapter caseEMSPhysicalAssessmentSection(EMSPhysicalAssessmentSection object)
      {
        return createEMSPhysicalAssessmentSectionAdapter();
      }
      @Override
      public Adapter caseEMSMedicationsAdministeredSection(EMSMedicationsAdministeredSection object)
      {
        return createEMSMedicationsAdministeredSectionAdapter();
      }
      @Override
      public Adapter caseEMSProceduresPerformedSection(EMSProceduresPerformedSection object)
      {
        return createEMSProceduresPerformedSectionAdapter();
      }
      @Override
      public Adapter caseEMSPatientCareNarrativeSection(EMSPatientCareNarrativeSection object)
      {
        return createEMSPatientCareNarrativeSectionAdapter();
      }
      @Override
      public Adapter caseEMSSceneSection(EMSSceneSection object)
      {
        return createEMSSceneSectionAdapter();
      }
      @Override
      public Adapter caseEMSDispatchSection(EMSDispatchSection object)
      {
        return createEMSDispatchSectionAdapter();
      }
      @Override
      public Adapter caseEMSDispositionSection(EMSDispositionSection object)
      {
        return createEMSDispositionSectionAdapter();
      }
      @Override
      public Adapter caseEMSPersonnelAdverseEventSection(EMSPersonnelAdverseEventSection object)
      {
        return createEMSPersonnelAdverseEventSectionAdapter();
      }
      @Override
      public Adapter caseEMSProtocolSection(EMSProtocolSection object)
      {
        return createEMSProtocolSectionAdapter();
      }
      @Override
      public Adapter caseEMSResponseSection(EMSResponseSection object)
      {
        return createEMSResponseSectionAdapter();
      }
      @Override
      public Adapter caseEMSSituationSection(EMSSituationSection object)
      {
        return createEMSSituationSectionAdapter();
      }
      @Override
      public Adapter caseEMSTimesSection(EMSTimesSection object)
      {
        return createEMSTimesSectionAdapter();
      }
      @Override
      public Adapter caseEMSVitalSignsSection(EMSVitalSignsSection object)
      {
        return createEMSVitalSignsSectionAdapter();
      }
      @Override
      public Adapter caseDerivedEntry(DerivedEntry object)
      {
        return createDerivedEntryAdapter();
      }
      @Override
      public Adapter caseInfrastructureRoot(InfrastructureRoot object)
      {
        return createInfrastructureRootAdapter();
      }
      @Override
      public Adapter caseAct(Act object)
      {
        return createActAdapter();
      }
      @Override
      public Adapter caseClinicalDocument(ClinicalDocument object)
      {
        return createClinicalDocumentAdapter();
      }
      @Override
      public Adapter caseGeneralHeaderConstraints(GeneralHeaderConstraints object)
      {
        return createGeneralHeaderConstraintsAdapter();
      }
      @Override
      public Adapter caseSection(Section object)
      {
        return createSectionAdapter();
      }
      @Override
      public Adapter caseActRelationship(ActRelationship object)
      {
        return createActRelationshipAdapter();
      }
      @Override
      public Adapter caseEntry(Entry object)
      {
        return createEntryAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport <em>Patient Care Report</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport
   * @generated
   */
	public Adapter createPatientCareReportAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection <em>EMS Billing Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection
   * @generated
   */
	public Adapter createEMSBillingSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DerivedEntry <em>Derived Entry</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.DerivedEntry
   * @generated
   */
	public Adapter createDerivedEntryAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection <em>EMS Injury Incident Description Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection
   * @generated
   */
	public Adapter createEMSInjuryIncidentDescriptionSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection <em>EMS Current Medication Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection
   * @generated
   */
	public Adapter createEMSCurrentMedicationSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection <em>EMS Cardiac Arrest Event Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection
   * @generated
   */
	public Adapter createEMSCardiacArrestEventSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection <em>EMS Advance Directives Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection
   * @generated
   */
	public Adapter createEMSAdvanceDirectivesSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection <em>EMS Allergies And Adverse Reactions Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection
   * @generated
   */
	public Adapter createEMSAllergiesAndAdverseReactionsSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection <em>EMS Past Medical History Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection
   * @generated
   */
	public Adapter createEMSPastMedicalHistorySectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection <em>EMS Social History Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSSocialHistorySection
   * @generated
   */
	public Adapter createEMSSocialHistorySectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection <em>EMS Physical Assessment Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection
   * @generated
   */
	public Adapter createEMSPhysicalAssessmentSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection <em>EMS Medications Administered Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection
   * @generated
   */
	public Adapter createEMSMedicationsAdministeredSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection <em>EMS Procedures Performed Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection
   * @generated
   */
	public Adapter createEMSProceduresPerformedSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection <em>EMS Patient Care Narrative Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection
   * @generated
   */
	public Adapter createEMSPatientCareNarrativeSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection <em>EMS Scene Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection
   * @generated
   */
	public Adapter createEMSSceneSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection <em>EMS Dispatch Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection
   * @generated
   */
	public Adapter createEMSDispatchSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection <em>EMS Vital Signs Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection
   * @generated
   */
	public Adapter createEMSVitalSignsSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection <em>EMS Disposition Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection
   * @generated
   */
	public Adapter createEMSDispositionSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection <em>EMS Personnel Adverse Event Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection
   * @generated
   */
	public Adapter createEMSPersonnelAdverseEventSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection <em>EMS Protocol Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection
   * @generated
   */
	public Adapter createEMSProtocolSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection <em>EMS Response Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection
   * @generated
   */
	public Adapter createEMSResponseSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection <em>EMS Situation Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection
   * @generated
   */
	public Adapter createEMSSituationSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection <em>EMS Times Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection
   * @generated
   */
	public Adapter createEMSTimesSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot
   * @generated
   */
	public Adapter createInfrastructureRootAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Act <em>Act</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.hl7.rim.Act
   * @generated
   */
	public Adapter createActAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument
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
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Section
   * @generated
   */
	public Adapter createSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.ActRelationship <em>Act Relationship</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.hl7.rim.ActRelationship
   * @generated
   */
	public Adapter createActRelationshipAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Entry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Entry
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

} // EmspcrAdapterFactory
