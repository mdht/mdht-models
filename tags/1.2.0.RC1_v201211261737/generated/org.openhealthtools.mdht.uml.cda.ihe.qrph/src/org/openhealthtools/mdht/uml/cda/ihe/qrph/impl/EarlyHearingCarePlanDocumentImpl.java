/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.ihe.ProceduresAndInterventionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.impl.MedicalDocumentImpl;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.EarlyHearingCarePlanDocument;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.HearingScreeningCodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphPackage;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.RiskIndicatorsForHearingLossSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.operations.EarlyHearingCarePlanDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Early Hearing Care Plan Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EarlyHearingCarePlanDocumentImpl extends MedicalDocumentImpl implements EarlyHearingCarePlanDocument
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EarlyHearingCarePlanDocumentImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return QrphPackage.Literals.EARLY_HEARING_CARE_PLAN_DOCUMENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateEarlyHearingCarePlanDocumentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return EarlyHearingCarePlanDocumentOperations.validateEarlyHearingCarePlanDocumentCodeP(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateEarlyHearingCarePlanDocumentCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return EarlyHearingCarePlanDocumentOperations.validateEarlyHearingCarePlanDocumentCode(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RiskIndicatorsForHearingLossSection getRiskIndicatorsForHearingLossSection()
  {
		return EarlyHearingCarePlanDocumentOperations.getRiskIndicatorsForHearingLossSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ActiveProblemsSection getActiveProblemsSection()
  {
		return EarlyHearingCarePlanDocumentOperations.getActiveProblemsSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PhysicalExamSection getPhysicalExamSection()
  {
		return EarlyHearingCarePlanDocumentOperations.getPhysicalExamSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ReviewOfSystemsSection getReviewOfSystemsSection()
  {
		return EarlyHearingCarePlanDocumentOperations.getReviewOfSystemsSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ProceduresAndInterventionsSection getProceduresAndInterventionsSection()
  {
		return EarlyHearingCarePlanDocumentOperations.getProceduresAndInterventionsSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HearingScreeningCodedResultsSection getHearingScreeningCodedResultsSection()
  {
		return EarlyHearingCarePlanDocumentOperations.getHearingScreeningCodedResultsSection(this);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateMedicalDocumentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return EarlyHearingCarePlanDocumentOperations.validateMedicalDocumentTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
public EarlyHearingCarePlanDocument init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public EarlyHearingCarePlanDocument init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //EarlyHearingCarePlanDocumentImpl
