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
import org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.operations.CharacteristicsOfHomeEnvironmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristics Of Home Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CharacteristicsOfHomeEnvironmentImpl extends ObservationImpl implements CharacteristicsOfHomeEnvironment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicsOfHomeEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CHARACTERISTICS_OF_HOME_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCharacteristicsOfHomeEnvironmentTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCharacteristicsOfHomeEnvironmentClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCharacteristicsOfHomeEnvironmentMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCharacteristicsOfHomeEnvironmentId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCharacteristicsOfHomeEnvironmentCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCharacteristicsOfHomeEnvironmentCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCharacteristicsOfHomeEnvironmentStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCharacteristicsOfHomeEnvironmentStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCharacteristicsOfHomeEnvironmentValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacteristicsOfHomeEnvironmentValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacteristicsOfHomeEnvironment init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacteristicsOfHomeEnvironment init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CharacteristicsOfHomeEnvironmentImpl
