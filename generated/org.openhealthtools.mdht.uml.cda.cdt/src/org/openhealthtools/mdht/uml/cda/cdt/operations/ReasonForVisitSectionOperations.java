/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPlugin;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason For Visit Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSection#validateReasonForVisitSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSection#validateReasonForVisitSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReasonForVisitSectionOperations extends SectionOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasonForVisitSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForVisitSectionTemplateId(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionTemplateId(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForVisitSectionTemplateId(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionTemplateId(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonForVisitSection The receiving '<em><b>Reason For Visit Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReasonForVisitSectionTemplateId(ReasonForVisitSection reasonForVisitSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.REASON_FOR_VISIT_SECTION);
			try {
				VALIDATE_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REASON_FOR_VISIT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reasonForVisitSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.REASON_FOR_VISIT_SECTION__REASON_FOR_VISIT_SECTION_TEMPLATE_ID,
						CDTPlugin.INSTANCE.getString("ReasonForVisitSectionReasonForVisitSectionTemplateId"),
						new Object[] { reasonForVisitSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReasonForVisitSectionCode(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionCode(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '29299-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateReasonForVisitSectionCode(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Visit Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReasonForVisitSectionCode(ReasonForVisitSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param reasonForVisitSection The receiving '<em><b>Reason For Visit Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateReasonForVisitSectionCode(ReasonForVisitSection reasonForVisitSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.REASON_FOR_VISIT_SECTION);
			try {
				VALIDATE_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_REASON_FOR_VISIT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				reasonForVisitSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.REASON_FOR_VISIT_SECTION__REASON_FOR_VISIT_SECTION_CODE,
						CDTPlugin.INSTANCE.getString("ReasonForVisitSectionReasonForVisitSectionCode"),
						new Object[] { reasonForVisitSection }));
			}

			return false;
		}
		return true;
	}

} // ReasonForVisitSectionOperations
