/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.Condition;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Chief Complaint Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection#validateChiefComplaintSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection#validateChiefComplaintSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection#validateChiefComplaintSectionCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection#getCondition() <em>Get Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChiefComplaintSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChiefComplaintSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChiefComplaintSectionTemplateId(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintSectionTemplateId(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.105')";

	/**
	 * The cached OCL invariant for the '{@link #validateChiefComplaintSectionTemplateId(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintSectionTemplateId(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.105')
	 * @param chiefComplaintSection The receiving '<em><b>Chief Complaint Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateChiefComplaintSectionTemplateId(ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHIEF_COMPLAINT_SECTION);
			try {
				VALIDATE_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chiefComplaintSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("ChiefComplaintSectionTemplateId"),
						 new Object [] { chiefComplaintSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChiefComplaintSectionCode(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintSectionCode(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '10154-3' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateChiefComplaintSectionCode(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintSectionCode(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '10154-3' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param chiefComplaintSection The receiving '<em><b>Chief Complaint Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateChiefComplaintSectionCode(ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHIEF_COMPLAINT_SECTION);
			try {
				VALIDATE_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHIEF_COMPLAINT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chiefComplaintSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("ChiefComplaintSectionCode"),
						 new Object [] { chiefComplaintSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChiefComplaintSectionCondition(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintSectionCondition(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHIEF_COMPLAINT_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::Condition))";

	/**
	 * The cached OCL invariant for the '{@link #validateChiefComplaintSectionCondition(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chief Complaint Section Condition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChiefComplaintSectionCondition(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CHIEF_COMPLAINT_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::Condition))
	 * @param chiefComplaintSection The receiving '<em><b>Chief Complaint Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateChiefComplaintSectionCondition(ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CHIEF_COMPLAINT_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CHIEF_COMPLAINT_SECTION);
			try {
				VALIDATE_CHIEF_COMPLAINT_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHIEF_COMPLAINT_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHIEF_COMPLAINT_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chiefComplaintSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_CONDITION,
						 ConsolPlugin.INSTANCE.getString("ChiefComplaintSectionCondition"),
						 new Object [] { chiefComplaintSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCondition(ChiefComplaintSection) <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition(ChiefComplaintSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONDITION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Condition))->asSequence()->first().oclAsType(consol::Condition)";

	/**
	 * The cached OCL query for the '{@link #getCondition(ChiefComplaintSection) <em>Get Condition</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition(ChiefComplaintSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONDITION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Condition))->asSequence()->first().oclAsType(consol::Condition)
	 * @param chiefComplaintSection The receiving '<em><b>Chief Complaint Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  Condition getCondition(ChiefComplaintSection chiefComplaintSection) {
		if (GET_CONDITION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.CHIEF_COMPLAINT_SECTION, ConsolPackage.Literals.CHIEF_COMPLAINT_SECTION.getEAllOperations().get(58));
			try {
				GET_CONDITION__EOCL_QRY = helper.createQuery(GET_CONDITION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONDITION__EOCL_QRY);
		return (Condition) query.evaluate(chiefComplaintSection);
	}

} // ChiefComplaintSectionOperations