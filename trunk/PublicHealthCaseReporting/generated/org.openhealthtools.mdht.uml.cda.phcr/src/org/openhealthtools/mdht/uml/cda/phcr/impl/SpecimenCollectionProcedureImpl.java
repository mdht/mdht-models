/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ProcedureImpl;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure;
import org.openhealthtools.mdht.uml.cda.phcr.operations.SpecimenCollectionProcedureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Collection Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SpecimenCollectionProcedureImpl extends ProcedureImpl implements SpecimenCollectionProcedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenCollectionProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhcrPackage.Literals.SPECIMEN_COLLECTION_PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenCollectionProcedureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenCollectionProcedureOperations.validateSpecimenCollectionProcedureTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenCollectionProcedureClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenCollectionProcedureOperations.validateSpecimenCollectionProcedureClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenCollectionProcedureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenCollectionProcedureOperations.validateSpecimenCollectionProcedureMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenCollectionProcedureCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenCollectionProcedureOperations.validateSpecimenCollectionProcedureCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenCollectionProcedureEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenCollectionProcedureOperations.validateSpecimenCollectionProcedureEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenCollectionProcedureTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SpecimenCollectionProcedureOperations.validateSpecimenCollectionProcedureTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenCollectionProcedure init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecimenCollectionProcedure init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //SpecimenCollectionProcedureImpl
