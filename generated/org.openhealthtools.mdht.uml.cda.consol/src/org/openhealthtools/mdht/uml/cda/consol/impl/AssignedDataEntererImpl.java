/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.AssignedDataEnterer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AssignedDataEntererOperations;

import org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assigned Data Enterer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssignedDataEntererImpl extends AssignedEntityImpl implements AssignedDataEnterer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignedDataEntererImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ASSIGNED_DATA_ENTERER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedDataEntererAssignedPerson(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssignedDataEntererOperations.validateAssignedDataEntererAssignedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedDataEntererAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssignedDataEntererOperations.validateAssignedDataEntererAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedDataEntererCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssignedDataEntererOperations.validateAssignedDataEntererCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedDataEntererId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssignedDataEntererOperations.validateAssignedDataEntererId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedDataEntererTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssignedDataEntererOperations.validateAssignedDataEntererTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedDataEnterer init() {
		CDAUtil.init(this);
		return this;
	}
} // AssignedDataEntererImpl
