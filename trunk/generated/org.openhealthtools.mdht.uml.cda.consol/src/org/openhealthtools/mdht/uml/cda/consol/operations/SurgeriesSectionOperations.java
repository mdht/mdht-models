/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ExternalReference;
import org.openhealthtools.mdht.uml.cda.consol.Procedure;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Surgeries Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection#validateSurgeriesSectionHasProcedureActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Has Procedure Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection#validateSurgeriesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection#validateSurgeriesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection#validateSurgeriesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection#validateSurgeriesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection#validateSurgeriesSectionProcedureActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Procedure Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection#validateSurgeriesSectionExternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection#validateSurgeriesSectionProcedureEntryProcedureActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Procedure Entry Procedure Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection#getProcedureActivities() <em>Get Procedure Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection#getExternalReference() <em>Get External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection#getProcedureEntryProcedureActivityProcedures() <em>Get Procedure Entry Procedure Activity Procedures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurgeriesSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurgeriesSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSurgeriesSectionHasProcedureActivity(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Has Procedure Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionHasProcedureActivity(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SURGERIES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entry->select(e | e.act.oclIsKindOf(ccd::ProcedureActivity))->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateSurgeriesSectionHasProcedureActivity(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Has Procedure Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionHasProcedureActivity(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SURGERIES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entry->select(e | e.act.oclIsKindOf(ccd::ProcedureActivity))->isEmpty()
	 * @param surgeriesSection The receiving '<em><b>Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSurgeriesSectionHasProcedureActivity(SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SURGERIES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SURGERIES_SECTION);
			try {
				VALIDATE_SURGERIES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SURGERIES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SURGERIES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(surgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SURGERIES_SECTION__SURGERIES_SECTION_HAS_PROCEDURE_ACTIVITY,
						 ConsolPlugin.INSTANCE.getString("SurgeriesSectionHasProcedureActivity"),
						 new Object [] { surgeriesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSurgeriesSectionTemplateId(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionTemplateId(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.108')";

	/**
	 * The cached OCL invariant for the '{@link #validateSurgeriesSectionTemplateId(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionTemplateId(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.108')
	 * @param surgeriesSection The receiving '<em><b>Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSurgeriesSectionTemplateId(SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SURGERIES_SECTION);
			try {
				VALIDATE_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(surgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SURGERIES_SECTION__SURGERIES_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("SurgeriesSectionTemplateId"),
						 new Object [] { surgeriesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSurgeriesSectionCode(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionCode(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SURGERIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '47519-4' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateSurgeriesSectionCode(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionCode(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SURGERIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '47519-4' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param surgeriesSection The receiving '<em><b>Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSurgeriesSectionCode(SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SURGERIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SURGERIES_SECTION);
			try {
				VALIDATE_SURGERIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SURGERIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SURGERIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(surgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SURGERIES_SECTION__SURGERIES_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("SurgeriesSectionCode"),
						 new Object [] { surgeriesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSurgeriesSectionTitle(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionTitle(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SURGERIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSurgeriesSectionTitle(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionTitle(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SURGERIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param surgeriesSection The receiving '<em><b>Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSurgeriesSectionTitle(SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SURGERIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SURGERIES_SECTION);
			try {
				VALIDATE_SURGERIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SURGERIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SURGERIES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(surgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SURGERIES_SECTION__SURGERIES_SECTION_TITLE,
						 ConsolPlugin.INSTANCE.getString("SurgeriesSectionTitle"),
						 new Object [] { surgeriesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSurgeriesSectionText(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionText(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SURGERIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateSurgeriesSectionText(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionText(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SURGERIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param surgeriesSection The receiving '<em><b>Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSurgeriesSectionText(SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SURGERIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SURGERIES_SECTION);
			try {
				VALIDATE_SURGERIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SURGERIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SURGERIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(surgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SURGERIES_SECTION__SURGERIES_SECTION_TEXT,
						 ConsolPlugin.INSTANCE.getString("SurgeriesSectionText"),
						 new Object [] { surgeriesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSurgeriesSectionProcedureActivity(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Procedure Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionProcedureActivity(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SURGERIES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::Procedure))";

	/**
	 * The cached OCL invariant for the '{@link #validateSurgeriesSectionProcedureActivity(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Procedure Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionProcedureActivity(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SURGERIES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::Procedure))
	 * @param surgeriesSection The receiving '<em><b>Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSurgeriesSectionProcedureActivity(SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SURGERIES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SURGERIES_SECTION);
			try {
				VALIDATE_SURGERIES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SURGERIES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SURGERIES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(surgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SURGERIES_SECTION__SURGERIES_SECTION_PROCEDURE_ACTIVITY,
						 ConsolPlugin.INSTANCE.getString("SurgeriesSectionProcedureActivity"),
						 new Object [] { surgeriesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSurgeriesSectionExternalReference(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section External Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionExternalReference(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::ExternalReference))";

	/**
	 * The cached OCL invariant for the '{@link #validateSurgeriesSectionExternalReference(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section External Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionExternalReference(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::ExternalReference))
	 * @param surgeriesSection The receiving '<em><b>Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSurgeriesSectionExternalReference(SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SURGERIES_SECTION);
			try {
				VALIDATE_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(surgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SURGERIES_SECTION__SURGERIES_SECTION_EXTERNAL_REFERENCE,
						 ConsolPlugin.INSTANCE.getString("SurgeriesSectionExternalReference"),
						 new Object [] { surgeriesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSurgeriesSectionProcedureEntryProcedureActivityProcedure(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Procedure Entry Procedure Activity Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionProcedureEntryProcedureActivityProcedure(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SURGERIES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::ProcedureEntryProcedureActivityProcedure))";

	/**
	 * The cached OCL invariant for the '{@link #validateSurgeriesSectionProcedureEntryProcedureActivityProcedure(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Procedure Entry Procedure Activity Procedure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionProcedureEntryProcedureActivityProcedure(SurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SURGERIES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::ProcedureEntryProcedureActivityProcedure))
	 * @param surgeriesSection The receiving '<em><b>Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSurgeriesSectionProcedureEntryProcedureActivityProcedure(SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SURGERIES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SURGERIES_SECTION);
			try {
				VALIDATE_SURGERIES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SURGERIES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SURGERIES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(surgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SURGERIES_SECTION__SURGERIES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE,
						 ConsolPlugin.INSTANCE.getString("SurgeriesSectionProcedureEntryProcedureActivityProcedure"),
						 new Object [] { surgeriesSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureActivities(SurgeriesSection) <em>Get Procedure Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivities(SurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ACTIVITIES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::Procedure)).oclAsType(consol::Procedure)";

	/**
	 * The cached OCL query for the '{@link #getProcedureActivities(SurgeriesSection) <em>Get Procedure Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivities(SurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::Procedure)).oclAsType(consol::Procedure)
	 * @param surgeriesSection The receiving '<em><b>Surgeries Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Procedure> getProcedureActivities(SurgeriesSection surgeriesSection) {
		if (GET_PROCEDURE_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.SURGERIES_SECTION, ConsolPackage.Literals.SURGERIES_SECTION.getEAllOperations().get(63));
			try {
				GET_PROCEDURE_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ACTIVITIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Procedure> result = (Collection<Procedure>) query.evaluate(surgeriesSection);
		return new BasicEList.UnmodifiableEList<Procedure>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getExternalReference(SurgeriesSection) <em>Get External Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference(SurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXTERNAL_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ExternalReference))->asSequence()->first().oclAsType(consol::ExternalReference)";

	/**
	 * The cached OCL query for the '{@link #getExternalReference(SurgeriesSection) <em>Get External Reference</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference(SurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXTERNAL_REFERENCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ExternalReference))->asSequence()->first().oclAsType(consol::ExternalReference)
	 * @param surgeriesSection The receiving '<em><b>Surgeries Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ExternalReference getExternalReference(SurgeriesSection surgeriesSection) {
		if (GET_EXTERNAL_REFERENCE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.SURGERIES_SECTION, ConsolPackage.Literals.SURGERIES_SECTION.getEAllOperations().get(64));
			try {
				GET_EXTERNAL_REFERENCE__EOCL_QRY = helper.createQuery(GET_EXTERNAL_REFERENCE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EXTERNAL_REFERENCE__EOCL_QRY);
		return (ExternalReference) query.evaluate(surgeriesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureEntryProcedureActivityProcedures(SurgeriesSection) <em>Get Procedure Entry Procedure Activity Procedures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEntryProcedureActivityProcedures(SurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureEntryProcedureActivityProcedure)).oclAsType(consol::ProcedureEntryProcedureActivityProcedure)";

	/**
	 * The cached OCL query for the '{@link #getProcedureEntryProcedureActivityProcedures(SurgeriesSection) <em>Get Procedure Entry Procedure Activity Procedures</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEntryProcedureActivityProcedures(SurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureEntryProcedureActivityProcedure)).oclAsType(consol::ProcedureEntryProcedureActivityProcedure)
	 * @param surgeriesSection The receiving '<em><b>Surgeries Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<ProcedureEntryProcedureActivityProcedure> getProcedureEntryProcedureActivityProcedures(SurgeriesSection surgeriesSection) {
		if (GET_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.SURGERIES_SECTION, ConsolPackage.Literals.SURGERIES_SECTION.getEAllOperations().get(65));
			try {
				GET_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureEntryProcedureActivityProcedure> result = (Collection<ProcedureEntryProcedureActivityProcedure>) query.evaluate(surgeriesSection);
		return new BasicEList.UnmodifiableEList<ProcedureEntryProcedureActivityProcedure>(result.size(), result.toArray());
	}

} // SurgeriesSectionOperations