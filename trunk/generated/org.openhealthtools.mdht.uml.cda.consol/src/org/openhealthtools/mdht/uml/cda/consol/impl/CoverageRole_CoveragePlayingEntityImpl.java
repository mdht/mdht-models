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
import org.openhealthtools.mdht.uml.cda.consol.CoverageRole_CoveragePlayingEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.CoverageRole_CoveragePlayingEntityOperations;

import org.openhealthtools.mdht.uml.cda.impl.PlayingEntityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Role Coverage Playing Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CoverageRole_CoveragePlayingEntityImpl extends PlayingEntityImpl implements CoverageRole_CoveragePlayingEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageRole_CoveragePlayingEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoveragePlayingEntityName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageRole_CoveragePlayingEntityOperations.validateCoveragePlayingEntityName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageRole_CoveragePlayingEntity init() {
    	CDAUtil.init(this);
    	return this;
	}
} //CoverageRole_CoveragePlayingEntityImpl
