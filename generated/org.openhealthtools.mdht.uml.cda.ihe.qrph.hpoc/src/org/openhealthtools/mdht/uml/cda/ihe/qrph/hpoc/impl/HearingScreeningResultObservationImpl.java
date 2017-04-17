/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultObservation;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.HearingScreeningResultObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hearing Screening Result Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HearingScreeningResultObservationImpl extends EObjectImpl implements HearingScreeningResultObservation
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected HearingScreeningResultObservationImpl()
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
		return HPOCPackage.Literals.HEARING_SCREENING_RESULT_OBSERVATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateResultObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultObservationOperations.validateResultObservationCodeP(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateResultObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultObservationOperations.validateResultObservationValueP(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateResultObservationMethodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultObservationOperations.validateResultObservationMethodCodeP(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateResultObservationTargetSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultObservationOperations.validateResultObservationTargetSiteCodeP(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservationEntryRelationshipReasonNotScreened(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultObservationOperations.validateHearingScreeningResultObservationEntryRelationshipReasonNotScreened(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservationAuthor(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultObservationOperations.validateHearingScreeningResultObservationAuthor(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultObservationPerformer(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultObservationOperations.validateHearingScreeningResultObservationPerformer(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearingScreeningResultObservation init() {
	    return Initializer.Util.init(this);
	}

		/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingScreeningResultObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultObservationOperations.validateResultObservationTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultObservationOperations.validateResultObservationCode(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultObservationText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultObservationOperations.validateResultObservationText(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultObservationOperations.validateResultObservationEffectiveTime(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultObservationOperations.validateResultObservationValue(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultObservationMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultObservationOperations.validateResultObservationMethodCode(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultObservationTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultObservationOperations.validateResultObservationTargetSiteCode(this, diagnostics, context);
	}
} //HearingScreeningResultObservationImpl
