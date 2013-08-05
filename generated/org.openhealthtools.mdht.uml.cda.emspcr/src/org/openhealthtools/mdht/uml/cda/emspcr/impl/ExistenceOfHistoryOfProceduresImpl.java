/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfProcedures;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExistenceOfHistoryOfProceduresOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Existence Of History Of Procedures</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExistenceOfHistoryOfProceduresImpl extends ObservationImpl implements ExistenceOfHistoryOfProcedures {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistenceOfHistoryOfProceduresImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EXISTENCE_OF_HISTORY_OF_PROCEDURES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfHistoryOfProceduresTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfHistoryOfProceduresOperations.validateExistenceOfHistoryOfProceduresTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfHistoryOfProceduresCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfHistoryOfProceduresOperations.validateExistenceOfHistoryOfProceduresCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfHistoryOfProceduresValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfHistoryOfProceduresOperations.validateExistenceOfHistoryOfProceduresValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfHistoryOfProceduresMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfHistoryOfProceduresOperations.validateExistenceOfHistoryOfProceduresMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfHistoryOfProcedures init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfHistoryOfProcedures init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ExistenceOfHistoryOfProceduresImpl
