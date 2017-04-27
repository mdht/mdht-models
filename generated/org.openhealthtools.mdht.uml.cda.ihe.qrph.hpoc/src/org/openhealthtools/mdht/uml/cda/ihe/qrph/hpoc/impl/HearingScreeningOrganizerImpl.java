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
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.HearingScreeningOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hearing Screening Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HearingScreeningOrganizerImpl extends EObjectImpl implements HearingScreeningOrganizer
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected HearingScreeningOrganizerImpl()
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
		return HPOCPackage.Literals.HEARING_SCREENING_ORGANIZER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateResultOrganizerCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningOrganizerOperations.validateResultOrganizerCodeP(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOrganizerComponentLeftEar(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningOrganizerOperations.validateHearingScreeningOrganizerComponentLeftEar(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOrganizerComponentRightEar(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningOrganizerOperations.validateHearingScreeningOrganizerComponentRightEar(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningOrganizerComponentResultsOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningOrganizerOperations.validateHearingScreeningOrganizerComponentResultsOrganizer(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearingScreeningOrganizer init() {
	    return Initializer.Util.init(this);
	}

		/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingScreeningOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
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
		return HearingScreeningOrganizerOperations.validateResultOrganizerTemplateId(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultOrganizerClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningOrganizerOperations.validateResultOrganizerClassCode(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningOrganizerOperations.validateResultOrganizerCode(this, diagnostics, context);
	}
} //HearingScreeningOrganizerImpl
