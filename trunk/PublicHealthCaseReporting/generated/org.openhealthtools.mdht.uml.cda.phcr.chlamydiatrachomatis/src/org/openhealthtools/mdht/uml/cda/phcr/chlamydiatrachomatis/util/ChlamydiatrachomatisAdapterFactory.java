/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;

import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage
 * @generated
 */
public class ChlamydiatrachomatisAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ChlamydiatrachomatisPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ChlamydiatrachomatisAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = ChlamydiatrachomatisPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
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
  protected ChlamydiatrachomatisSwitch<Adapter> modelSwitch =
    new ChlamydiatrachomatisSwitch<Adapter>() {
			@Override
			public Adapter caseChlamydiatrachomatisPublicHealthCaseReport(ChlamydiatrachomatisPublicHealthCaseReport object) {
				return createChlamydiatrachomatisPublicHealthCaseReportAdapter();
			}
			@Override
			public Adapter caseChlamydiatrachomatisPHCRClinicalInformationSection(ChlamydiatrachomatisPHCRClinicalInformationSection object) {
				return createChlamydiatrachomatisPHCRClinicalInformationSectionAdapter();
			}
			@Override
			public Adapter caseChlamydiatrachomatisCaseObservation(ChlamydiatrachomatisCaseObservation object) {
				return createChlamydiatrachomatisCaseObservationAdapter();
			}
			@Override
			public Adapter caseChlamydiatrachomatisPHCRRelevantDxTestsSection(ChlamydiatrachomatisPHCRRelevantDxTestsSection object) {
				return createChlamydiatrachomatisPHCRRelevantDxTestsSectionAdapter();
			}
			@Override
			public Adapter caseChlamydiatrachomatisResultObservation(ChlamydiatrachomatisResultObservation object) {
				return createChlamydiatrachomatisResultObservationAdapter();
			}
			@Override
			public Adapter casechlamydiatrachomatisResultOrganizer(chlamydiatrachomatisResultOrganizer object) {
				return createchlamydiatrachomatisResultOrganizerAdapter();
			}
			@Override
			public Adapter caseChlamydiatrachomatisPHCRTreatmentInformationSection(ChlamydiatrachomatisPHCRTreatmentInformationSection object) {
				return createChlamydiatrachomatisPHCRTreatmentInformationSectionAdapter();
			}
			@Override
			public Adapter caseChlamydiatrachomatisTherapeuticRegimenAct(ChlamydiatrachomatisTherapeuticRegimenAct object) {
				return createChlamydiatrachomatisTherapeuticRegimenActAdapter();
			}
			@Override
			public Adapter caseChlamydiatrachomatisTreatmentGivenSubstanceAdministration(ChlamydiatrachomatisTreatmentGivenSubstanceAdministration object) {
				return createChlamydiatrachomatisTreatmentGivenSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration(ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration object) {
				return createChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationAdapter();
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
			public Adapter casePublicHealthCaseReport(PublicHealthCaseReport object) {
				return createPublicHealthCaseReportAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter casePhcrClinicalInformationSection(PhcrClinicalInformationSection object) {
				return createPhcrClinicalInformationSectionAdapter();
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
			public Adapter caseProblemObservation(ProblemObservation object) {
				return createProblemObservationAdapter();
			}
			@Override
			public Adapter caseCaseObservation(CaseObservation object) {
				return createCaseObservationAdapter();
			}
			@Override
			public Adapter caseResultsSection(ResultsSection object) {
				return createResultsSectionAdapter();
			}
			@Override
			public Adapter casePhcrRelevantDxTestsSection(PhcrRelevantDxTestsSection object) {
				return createPhcrRelevantDxTestsSectionAdapter();
			}
			@Override
			public Adapter caseResultObservation(ResultObservation object) {
				return createResultObservationAdapter();
			}
			@Override
			public Adapter casePhcr_ResultObservation(org.openhealthtools.mdht.uml.cda.phcr.ResultObservation object) {
				return createPhcr_ResultObservationAdapter();
			}
			@Override
			public Adapter caseOrganizer(Organizer object) {
				return createOrganizerAdapter();
			}
			@Override
			public Adapter caseResultOrganizer(ResultOrganizer object) {
				return createResultOrganizerAdapter();
			}
			@Override
			public Adapter casePhcr_ResultOrganizer(org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer object) {
				return createPhcr_ResultOrganizerAdapter();
			}
			@Override
			public Adapter casePhcrTreatmentInformationSection(PhcrTreatmentInformationSection object) {
				return createPhcrTreatmentInformationSectionAdapter();
			}
			@Override
			public Adapter caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object) {
				return createCDA_ActAdapter();
			}
			@Override
			public Adapter caseTherapeuticRegimenAct(TherapeuticRegimenAct object) {
				return createTherapeuticRegimenActAdapter();
			}
			@Override
			public Adapter caseSubstanceAdministration(SubstanceAdministration object) {
				return createSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseTreatmentGivenSubstanceAdministration(TreatmentGivenSubstanceAdministration object) {
				return createTreatmentGivenSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseTreatmentNotGivenSubstanceAdministration(TreatmentNotGivenSubstanceAdministration object) {
				return createTreatmentNotGivenSubstanceAdministrationAdapter();
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
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport <em>Public Health Case Report</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport
	 * @generated
	 */
  public Adapter createChlamydiatrachomatisPublicHealthCaseReportAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRClinicalInformationSection <em>PHCR Clinical Information Section</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRClinicalInformationSection
	 * @generated
	 */
  public Adapter createChlamydiatrachomatisPHCRClinicalInformationSectionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisCaseObservation <em>Case Observation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisCaseObservation
	 * @generated
	 */
  public Adapter createChlamydiatrachomatisCaseObservationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRRelevantDxTestsSection <em>PHCR Relevant Dx Tests Section</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRRelevantDxTestsSection
	 * @generated
	 */
  public Adapter createChlamydiatrachomatisPHCRRelevantDxTestsSectionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisResultObservation <em>Result Observation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisResultObservation
	 * @generated
	 */
  public Adapter createChlamydiatrachomatisResultObservationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.chlamydiatrachomatisResultOrganizer <em>chlamydiatrachomatis Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.chlamydiatrachomatisResultOrganizer
	 * @generated
	 */
  public Adapter createchlamydiatrachomatisResultOrganizerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRTreatmentInformationSection <em>PHCR Treatment Information Section</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRTreatmentInformationSection
	 * @generated
	 */
  public Adapter createChlamydiatrachomatisPHCRTreatmentInformationSectionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct <em>Therapeutic Regimen Act</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct
	 * @generated
	 */
  public Adapter createChlamydiatrachomatisTherapeuticRegimenActAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTreatmentGivenSubstanceAdministration <em>Treatment Given Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTreatmentGivenSubstanceAdministration
	 * @generated
	 */
  public Adapter createChlamydiatrachomatisTreatmentGivenSubstanceAdministrationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration <em>Treatment Not Given Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration
	 * @generated
	 */
  public Adapter createChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationAdapter()
  {
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
  public Adapter createInfrastructureRootAdapter()
  {
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
  public Adapter createActAdapter()
  {
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
  public Adapter createClinicalDocumentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport <em>Public Health Case Report</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport
	 * @generated
	 */
  public Adapter createPublicHealthCaseReportAdapter()
  {
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
  public Adapter createSectionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection <em>Clinical Information Section</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection
	 * @generated
	 */
  public Adapter createPhcrClinicalInformationSectionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement <em>Clinical Statement</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalStatement
	 * @generated
	 */
  public Adapter createClinicalStatementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Observation
	 * @generated
	 */
  public Adapter createObservationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation <em>Problem Observation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation
	 * @generated
	 */
  public Adapter createProblemObservationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation <em>Case Observation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.CaseObservation
	 * @generated
	 */
  public Adapter createCaseObservationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ResultsSection <em>Results Section</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ResultsSection
	 * @generated
	 */
  public Adapter createResultsSectionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection <em>Relevant Dx Tests Section</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection
	 * @generated
	 */
  public Adapter createPhcrRelevantDxTestsSectionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation <em>Result Observation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ResultObservation
	 * @generated
	 */
  public Adapter createResultObservationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation <em>Result Observation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.ResultObservation
	 * @generated
	 */
  public Adapter createPhcr_ResultObservationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Organizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer
	 * @generated
	 */
  public Adapter createOrganizerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer <em>Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer
	 * @generated
	 */
  public Adapter createResultOrganizerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer <em>Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer
	 * @generated
	 */
  public Adapter createPhcr_ResultOrganizerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection <em>Treatment Information Section</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection
	 * @generated
	 */
  public Adapter createPhcrTreatmentInformationSectionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Act
	 * @generated
	 */
  public Adapter createCDA_ActAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct <em>Therapeutic Regimen Act</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct
	 * @generated
	 */
  public Adapter createTherapeuticRegimenActAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration <em>Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration
	 * @generated
	 */
  public Adapter createSubstanceAdministrationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration <em>Treatment Given Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration
	 * @generated
	 */
  public Adapter createTreatmentGivenSubstanceAdministrationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration <em>Treatment Not Given Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration
	 * @generated
	 */
  public Adapter createTreatmentNotGivenSubstanceAdministrationAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //ChlamydiatrachomatisAdapterFactory
