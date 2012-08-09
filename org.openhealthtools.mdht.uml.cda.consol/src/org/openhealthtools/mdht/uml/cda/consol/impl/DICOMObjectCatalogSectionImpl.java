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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection;
import org.openhealthtools.mdht.uml.cda.consol.StudyAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.DICOMObjectCatalogSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DICOM Object Catalog Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DICOMObjectCatalogSectionImpl extends SectionImpl implements DICOMObjectCatalogSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DICOMObjectCatalogSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DICOM_OBJECT_CATALOG_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICOMObjectCatalogSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DICOMObjectCatalogSectionOperations.validateDICOMObjectCatalogSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICOMObjectCatalogSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DICOMObjectCatalogSectionOperations.validateDICOMObjectCatalogSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICOMObjectCatalogSectionStudyAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DICOMObjectCatalogSectionOperations.validateDICOMObjectCatalogSectionStudyAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyAct getStudyAct() {
		return DICOMObjectCatalogSectionOperations.getStudyAct(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICOMObjectCatalogSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} // DICOMObjectCatalogSectionImpl
