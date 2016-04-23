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
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection;
import org.openhealthtools.mdht.uml.cda.consol.StudyAct;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>DICOM Object Catalog Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection#validateDICOMObjectCatalogSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate DICOM Object Catalog Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection#validateDICOMObjectCatalogSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate DICOM Object Catalog Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection#validateDICOMObjectCatalogSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate DICOM Object Catalog Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection#validateDICOMObjectCatalogSectionStudyAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate DICOM Object Catalog Section Study Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection#getStudyActs() <em>Get Study Acts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DICOMObjectCatalogSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DICOMObjectCatalogSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDICOMObjectCatalogSectionTemplateId(DICOMObjectCatalogSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate DICOM Object Catalog Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDICOMObjectCatalogSectionTemplateId(DICOMObjectCatalogSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DICOM_OBJECT_CATALOG_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDICOMObjectCatalogSectionTemplateId(DICOMObjectCatalogSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate DICOM Object Catalog Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDICOMObjectCatalogSectionTemplateId(DICOMObjectCatalogSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DICOM_OBJECT_CATALOG_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dicomObjectCatalogSection The receiving '<em><b>DICOM Object Catalog Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDICOMObjectCatalogSectionTemplateId(
			DICOMObjectCatalogSection dicomObjectCatalogSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_DICOM_OBJECT_CATALOG_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DICOM_OBJECT_CATALOG_SECTION);
			try {
				VALIDATE_DICOM_OBJECT_CATALOG_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DICOM_OBJECT_CATALOG_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DICOM_OBJECT_CATALOG_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dicomObjectCatalogSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DICOM_OBJECT_CATALOG_SECTION__DICOM_OBJECT_CATALOG_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("DICOMObjectCatalogSectionDICOMObjectCatalogSectionTemplateId"),
						 new Object [] { dicomObjectCatalogSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDICOMObjectCatalogSectionCode(DICOMObjectCatalogSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate DICOM Object Catalog Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDICOMObjectCatalogSectionCode(DICOMObjectCatalogSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DICOM_OBJECT_CATALOG_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '121181' and value.codeSystem = '1.2.840.10008.2.16.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateDICOMObjectCatalogSectionCode(DICOMObjectCatalogSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate DICOM Object Catalog Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDICOMObjectCatalogSectionCode(DICOMObjectCatalogSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DICOM_OBJECT_CATALOG_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dicomObjectCatalogSection The receiving '<em><b>DICOM Object Catalog Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDICOMObjectCatalogSectionCode(DICOMObjectCatalogSection dicomObjectCatalogSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DICOM_OBJECT_CATALOG_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DICOM_OBJECT_CATALOG_SECTION);
			try {
				VALIDATE_DICOM_OBJECT_CATALOG_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DICOM_OBJECT_CATALOG_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DICOM_OBJECT_CATALOG_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dicomObjectCatalogSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DICOM_OBJECT_CATALOG_SECTION__DICOM_OBJECT_CATALOG_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("DICOMObjectCatalogSectionDICOMObjectCatalogSectionCode"),
						 new Object [] { dicomObjectCatalogSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDICOMObjectCatalogSectionCodeP(DICOMObjectCatalogSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate DICOM Object Catalog Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDICOMObjectCatalogSectionCodeP(DICOMObjectCatalogSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DICOM_OBJECT_CATALOG_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDICOMObjectCatalogSectionCodeP(DICOMObjectCatalogSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate DICOM Object Catalog Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDICOMObjectCatalogSectionCodeP(DICOMObjectCatalogSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DICOM_OBJECT_CATALOG_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dicomObjectCatalogSection The receiving '<em><b>DICOM Object Catalog Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDICOMObjectCatalogSectionCodeP(DICOMObjectCatalogSection dicomObjectCatalogSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DICOM_OBJECT_CATALOG_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DICOM_OBJECT_CATALOG_SECTION);
			try {
				VALIDATE_DICOM_OBJECT_CATALOG_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DICOM_OBJECT_CATALOG_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DICOM_OBJECT_CATALOG_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dicomObjectCatalogSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DICOM_OBJECT_CATALOG_SECTION__DICOM_OBJECT_CATALOG_SECTION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("DICOMObjectCatalogSectionDICOMObjectCatalogSectionCodeP"),
						 new Object [] { dicomObjectCatalogSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDICOMObjectCatalogSectionStudyAct(DICOMObjectCatalogSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate DICOM Object Catalog Section Study Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDICOMObjectCatalogSectionStudyAct(DICOMObjectCatalogSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DICOM_OBJECT_CATALOG_SECTION_STUDY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::StudyAct))";

	/**
	 * The cached OCL invariant for the '{@link #validateDICOMObjectCatalogSectionStudyAct(DICOMObjectCatalogSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate DICOM Object Catalog Section Study Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDICOMObjectCatalogSectionStudyAct(DICOMObjectCatalogSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DICOM_OBJECT_CATALOG_SECTION_STUDY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dicomObjectCatalogSection The receiving '<em><b>DICOM Object Catalog Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDICOMObjectCatalogSectionStudyAct(
			DICOMObjectCatalogSection dicomObjectCatalogSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
		if (VALIDATE_DICOM_OBJECT_CATALOG_SECTION_STUDY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DICOM_OBJECT_CATALOG_SECTION);
			try {
				VALIDATE_DICOM_OBJECT_CATALOG_SECTION_STUDY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DICOM_OBJECT_CATALOG_SECTION_STUDY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DICOM_OBJECT_CATALOG_SECTION_STUDY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dicomObjectCatalogSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DICOM_OBJECT_CATALOG_SECTION__DICOM_OBJECT_CATALOG_SECTION_STUDY_ACT,
						 ConsolPlugin.INSTANCE.getString("DICOMObjectCatalogSectionDICOMObjectCatalogSectionStudyAct"),
						 new Object [] { dicomObjectCatalogSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudyActs(DICOMObjectCatalogSection) <em>Get Study Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyActs(DICOMObjectCatalogSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::StudyAct)).oclAsType(consol::StudyAct)";

	/**
	 * The cached OCL query for the '{@link #getStudyActs(DICOMObjectCatalogSection) <em>Get Study Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyActs(DICOMObjectCatalogSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<StudyAct> getStudyActs(DICOMObjectCatalogSection dicomObjectCatalogSection) {
		if (GET_STUDY_ACTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.DICOM_OBJECT_CATALOG_SECTION, ConsolPackage.Literals.DICOM_OBJECT_CATALOG_SECTION.getEAllOperations().get(59));
			try {
				GET_STUDY_ACTS__EOCL_QRY = helper.createQuery(GET_STUDY_ACTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<StudyAct> result = (Collection<StudyAct>) query.evaluate(dicomObjectCatalogSection);
		return new BasicEList.UnmodifiableEList<StudyAct>(result.size(), result.toArray());
	}

} // DICOMObjectCatalogSectionOperations
