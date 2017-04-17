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
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningResultsOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.HearingScreeningResultsOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hearing Screening Results Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HearingScreeningResultsOrganizerImpl extends EObjectImpl implements HearingScreeningResultsOrganizer
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected HearingScreeningResultsOrganizerImpl()
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
		return HPOCPackage.Literals.HEARING_SCREENING_RESULTS_ORGANIZER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateResultOrganizerCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultsOrganizerOperations.validateResultOrganizerCodeP(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningResultsOrganizerComponentResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultsOrganizerOperations.validateHearingScreeningResultsOrganizerComponentResultObservation(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearingScreeningResultsOrganizer init() {
	    return Initializer.Util.init(this);
	}

		/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingScreeningResultsOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultsOrganizerOperations.validateResultOrganizerTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultOrganizerClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultsOrganizerOperations.validateResultOrganizerClassCode(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultsOrganizerOperations.validateResultOrganizerCode(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultOrganizerStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultsOrganizerOperations.validateResultOrganizerStatusCodeP(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultOrganizerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningResultsOrganizerOperations.validateResultOrganizerStatusCode(this, diagnostics, context);
	}
} //HearingScreeningResultsOrganizerImpl
