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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage;
import org.openhealthtools.mdht.uml.cda.consol.operations.HighestPressureUlcerStageOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Highest Pressure Ulcer Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HighestPressureUlcerStageImpl extends ObservationImpl implements HighestPressureUlcerStage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HighestPressureUlcerStageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HIGHEST_PRESSURE_ULCER_STAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighestPressureUlcerStageTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HighestPressureUlcerStageOperations.validateHighestPressureUlcerStageTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighestPressureUlcerStageClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HighestPressureUlcerStageOperations.validateHighestPressureUlcerStageClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighestPressureUlcerStageMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HighestPressureUlcerStageOperations.validateHighestPressureUlcerStageMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighestPressureUlcerStageId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HighestPressureUlcerStageOperations.validateHighestPressureUlcerStageId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighestPressureUlcerStageCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HighestPressureUlcerStageOperations.validateHighestPressureUlcerStageCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighestPressureUlcerStageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HighestPressureUlcerStageOperations.validateHighestPressureUlcerStageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighestPressureUlcerStageValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HighestPressureUlcerStageOperations.validateHighestPressureUlcerStageValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighestPressureUlcerStage init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighestPressureUlcerStage init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HighestPressureUlcerStageImpl
