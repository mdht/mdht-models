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
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coded Surgeries Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection#validateCodedSurgeriesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Surgeries Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection#validateCodedSurgeriesSectionExternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Surgeries Section External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection#validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Surgeries Section Procedure Entry Procedure Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection#getExternalReference() <em>Get External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection#getProcedureEntryProcedureActivityProcedures() <em>Get Procedure Entry Procedure Activity Procedures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodedSurgeriesSectionOperations extends SurgeriesSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodedSurgeriesSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedSurgeriesSectionTemplateId(CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Surgeries Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedSurgeriesSectionTemplateId(CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.12')";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedSurgeriesSectionTemplateId(CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Surgeries Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedSurgeriesSectionTemplateId(CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.12')
	 * @param codedSurgeriesSection The receiving '<em><b>Coded Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCodedSurgeriesSectionTemplateId(CodedSurgeriesSection codedSurgeriesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_SURGERIES_SECTION);
			try {
				VALIDATE_CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codedSurgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.CODED_SURGERIES_SECTION__CODED_SURGERIES_SECTION_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("CodedSurgeriesSectionTemplateId"),
					new Object[] { codedSurgeriesSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedSurgeriesSectionExternalReference(CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Surgeries Section External Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedSurgeriesSectionExternalReference(CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(ihe::ExternalReference))";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedSurgeriesSectionExternalReference(CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Surgeries Section External Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedSurgeriesSectionExternalReference(CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODED_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(ihe::ExternalReference))
	 * @param codedSurgeriesSection The receiving '<em><b>Coded Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCodedSurgeriesSectionExternalReference(CodedSurgeriesSection codedSurgeriesSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CODED_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_SURGERIES_SECTION);
			try {
				VALIDATE_CODED_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODED_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codedSurgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.CODED_SURGERIES_SECTION__CODED_SURGERIES_SECTION_EXTERNAL_REFERENCE,
					IHEPlugin.INSTANCE.getString("CodedSurgeriesSectionExternalReference"),
					new Object[] { codedSurgeriesSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure(CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Surgeries Section Procedure Entry Procedure Activity Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure(CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_SURGERIES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(ihe::ProcedureEntryProcedureActivityProcedure))";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure(CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Surgeries Section Procedure Entry Procedure Activity Procedure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure(CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODED_SURGERIES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(ihe::ProcedureEntryProcedureActivityProcedure))
	 * @param codedSurgeriesSection The receiving '<em><b>Coded Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure(
			CodedSurgeriesSection codedSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CODED_SURGERIES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_SURGERIES_SECTION);
			try {
				VALIDATE_CODED_SURGERIES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_SURGERIES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CODED_SURGERIES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codedSurgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.CODED_SURGERIES_SECTION__CODED_SURGERIES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE,
					IHEPlugin.INSTANCE.getString("CodedSurgeriesSectionProcedureEntryProcedureActivityProcedure"),
					new Object[] { codedSurgeriesSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getExternalReference(CodedSurgeriesSection) <em>Get External Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference(CodedSurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXTERNAL_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::ExternalReference))->asSequence()->any(true).oclAsType(ihe::ExternalReference)";

	/**
	 * The cached OCL query for the '{@link #getExternalReference(CodedSurgeriesSection) <em>Get External Reference</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference(CodedSurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXTERNAL_REFERENCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::ExternalReference))->asSequence()->any(true).oclAsType(ihe::ExternalReference)
	 * @param codedSurgeriesSection The receiving '<em><b>Coded Surgeries Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ExternalReference getExternalReference(CodedSurgeriesSection codedSurgeriesSection) {
		if (GET_EXTERNAL_REFERENCE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.CODED_SURGERIES_SECTION,
				IHEPackage.Literals.CODED_SURGERIES_SECTION.getEAllOperations().get(64));
			try {
				GET_EXTERNAL_REFERENCE__EOCL_QRY = helper.createQuery(GET_EXTERNAL_REFERENCE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EXTERNAL_REFERENCE__EOCL_QRY);
		return (ExternalReference) query.evaluate(codedSurgeriesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureEntryProcedureActivityProcedures(CodedSurgeriesSection) <em>Get Procedure Entry Procedure Activity Procedures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEntryProcedureActivityProcedures(CodedSurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(ihe::ProcedureEntryProcedureActivityProcedure)).oclAsType(ihe::ProcedureEntryProcedureActivityProcedure)";

	/**
	 * The cached OCL query for the '{@link #getProcedureEntryProcedureActivityProcedures(CodedSurgeriesSection) <em>Get Procedure Entry Procedure Activity Procedures</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEntryProcedureActivityProcedures(CodedSurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(ihe::ProcedureEntryProcedureActivityProcedure)).oclAsType(ihe::ProcedureEntryProcedureActivityProcedure)
	 * @param codedSurgeriesSection The receiving '<em><b>Coded Surgeries Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ProcedureEntryProcedureActivityProcedure> getProcedureEntryProcedureActivityProcedures(
			CodedSurgeriesSection codedSurgeriesSection) {
		if (GET_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.CODED_SURGERIES_SECTION,
				IHEPackage.Literals.CODED_SURGERIES_SECTION.getEAllOperations().get(65));
			try {
				GET_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureEntryProcedureActivityProcedure> result = (Collection<ProcedureEntryProcedureActivityProcedure>) query.evaluate(codedSurgeriesSection);
		return new BasicEList.UnmodifiableEList<ProcedureEntryProcedureActivityProcedure>(
			result.size(), result.toArray());
	}

} // CodedSurgeriesSectionOperations
