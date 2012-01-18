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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ServiceEvent3_Performer;

import org.openhealthtools.mdht.uml.cda.consol.operations.ServiceEvent3_PerformerOperations;

import org.openhealthtools.mdht.uml.cda.impl.Performer1Impl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Event3 Performer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ServiceEvent3_PerformerImpl extends Performer1Impl implements ServiceEvent3_Performer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceEvent3_PerformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SERVICE_EVENT3_PERFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ServiceEvent3_PerformerOperations.validatePerformerTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformerAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ServiceEvent3_PerformerOperations.validatePerformerAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEvent3_Performer init() {
		CDAUtil.init(this);
		return this;
	}
} // ServiceEvent3_PerformerImpl
