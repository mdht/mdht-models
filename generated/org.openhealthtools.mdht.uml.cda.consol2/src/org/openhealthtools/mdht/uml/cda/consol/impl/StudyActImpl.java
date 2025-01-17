/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.SeriesAct;
import org.openhealthtools.mdht.uml.cda.consol.StudyAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.StudyActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StudyActImpl extends ActImpl implements StudyAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.STUDY_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyActIdsHaveRoot(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyActOperations.validateStudyActIdsHaveRoot(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyActNoIdExtension(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyActOperations.validateStudyActNoIdExtension(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyActTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyActOperations.validateStudyActTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyActTextReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyActOperations.validateStudyActTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyActReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyActOperations.validateStudyActReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyActOperations.validateStudyActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyActOperations.validateStudyActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyActOperations.validateStudyActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyActOperations.validateStudyActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyActOperations.validateStudyActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyActOperations.validateStudyActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyActText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyActOperations.validateStudyActText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyActSeriesAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return StudyActOperations.validateStudyActSeriesAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesAct getSeriesAct() {
		return StudyActOperations.getSeriesAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyAct init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // StudyActImpl
