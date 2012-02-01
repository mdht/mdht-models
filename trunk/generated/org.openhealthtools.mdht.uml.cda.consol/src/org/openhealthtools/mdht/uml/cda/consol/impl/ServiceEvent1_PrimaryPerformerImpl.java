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
import org.openhealthtools.mdht.uml.cda.consol.ServiceEvent1_PrimaryPerformer;

import org.openhealthtools.mdht.uml.cda.consol.operations.ServiceEvent1_PrimaryPerformerOperations;

import org.openhealthtools.mdht.uml.cda.impl.Performer1Impl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Event1 Primary Performer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ServiceEvent1_PrimaryPerformerImpl extends Performer1Impl implements ServiceEvent1_PrimaryPerformer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceEvent1_PrimaryPerformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SERVICE_EVENT1_PRIMARY_PERFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryPerformerFunctionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ServiceEvent1_PrimaryPerformerOperations.validatePrimaryPerformerFunctionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEvent1_PrimaryPerformer init() {
    	CDAUtil.init(this);
    	return this;
	}
} // ServiceEvent1_PrimaryPerformerImpl
