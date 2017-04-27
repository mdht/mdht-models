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
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations.HearingScreeningSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hearing Screening Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HearingScreeningSectionImpl extends EObjectImpl implements HearingScreeningSection
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected HearingScreeningSectionImpl()
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
		return HPOCPackage.Literals.HEARING_SCREENING_SECTION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningSectionOperations.validateHearingScreeningSectionCode(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningSectionOperations.validateHearingScreeningSectionCodeP(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningSectionText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningSectionOperations.validateHearingScreeningSectionText(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningSectionOperations.validateHearingScreeningSectionTitle(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHearingScreeningSectionEntry(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningSectionOperations.validateHearingScreeningSectionEntry(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HearingScreeningSection init() {
	    return Initializer.Util.init(this);
	}

		/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HearingScreeningSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean validateResultsSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return HearingScreeningSectionOperations.validateResultsSectionEntriesOptionalTemplateId(this, diagnostics, context);
	}
} //HearingScreeningSectionImpl
