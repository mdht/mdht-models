/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedication2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeMedication2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discharge Medication2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DischargeMedication2Impl extends DischargeMedicationImpl implements DischargeMedication2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeMedication2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DISCHARGE_MEDICATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeMedication2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeMedication2Operations.validateDischargeMedication2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDischargeMedicationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeMedication2Operations.validateDischargeMedicationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeMedication2StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeMedication2Operations.validateDischargeMedication2StatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeMedication2StatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeMedication2Operations.validateDischargeMedication2StatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeMedication2CDTranslation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeMedication2Operations.validateDischargeMedication2CDTranslation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeMedication2CDTranslationP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeMedication2Operations.validateDischargeMedication2CDTranslationP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicationActivity2> getConsolMedicationActivity2s() {
		return DischargeMedication2Operations.getConsolMedicationActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDischargeMedicationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeMedication2Operations.validateDischargeMedicationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDischargeMedicationMedicationActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeMedication2Operations.validateDischargeMedicationMedicationActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DischargeMedication2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DischargeMedication2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // DischargeMedication2Impl
