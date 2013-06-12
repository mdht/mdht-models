/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

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

import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureDescriptionSectionOperations;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.Procedure;
import org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures Performed Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection#validateProceduresPerformedSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection#validateProceduresPerformedSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection#validateProceduresPerformedSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection#validateProceduresPerformedSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection#validateProceduresPerformedSectionProcedureActivityProcedure1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Procedure Activity Procedure1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection#getProcedureActivityProcedure1s() <em>Get Procedure Activity Procedure1s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection#validateProcedureDescriptionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Description Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProceduresPerformedSectionOperations extends ProcedureDescriptionSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProceduresPerformedSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresPerformedSectionCodeP(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresPerformedSectionCodeP(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_PERFORMED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresPerformedSectionCodeP(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresPerformedSectionCodeP(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PROCEDURES_PERFORMED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresPerformedSection The receiving '<em><b>Procedures Performed Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateProceduresPerformedSectionCodeP(ProceduresPerformedSection proceduresPerformedSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURES_PERFORMED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURES_PERFORMED_SECTION);
			try {
				VALIDATE_PROCEDURES_PERFORMED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_PERFORMED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_PERFORMED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresPerformedSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURES_PERFORMED_SECTION__PROCEDURES_PERFORMED_SECTION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ProceduresPerformedSectionCodeP"),
						 new Object [] { proceduresPerformedSection }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSectionCodeP", passToken);
				}
				passToken.add(proceduresPerformedSection);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresPerformedSectionCode(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresPerformedSectionCode(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_PERFORMED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '29554-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresPerformedSectionCode(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresPerformedSectionCode(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PROCEDURES_PERFORMED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresPerformedSection The receiving '<em><b>Procedures Performed Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateProceduresPerformedSectionCode(ProceduresPerformedSection proceduresPerformedSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(proceduresPerformedSection)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_PROCEDURES_PERFORMED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURES_PERFORMED_SECTION);
			try {
				VALIDATE_PROCEDURES_PERFORMED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_PERFORMED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_PERFORMED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresPerformedSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURES_PERFORMED_SECTION__PROCEDURES_PERFORMED_SECTION_CODE,
						 EmspcrPlugin.INSTANCE.getString("ProceduresPerformedSectionCode"),
						 new Object [] { proceduresPerformedSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresPerformedSectionTitle(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresPerformedSectionTitle(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_PERFORMED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'EMS Procedures Performed')";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresPerformedSectionTitle(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresPerformedSectionTitle(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PROCEDURES_PERFORMED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresPerformedSection The receiving '<em><b>Procedures Performed Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateProceduresPerformedSectionTitle(ProceduresPerformedSection proceduresPerformedSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURES_PERFORMED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURES_PERFORMED_SECTION);
			try {
				VALIDATE_PROCEDURES_PERFORMED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_PERFORMED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_PERFORMED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresPerformedSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURES_PERFORMED_SECTION__PROCEDURES_PERFORMED_SECTION_TITLE,
						 EmspcrPlugin.INSTANCE.getString("ProceduresPerformedSectionTitle"),
						 new Object [] { proceduresPerformedSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresPerformedSectionText(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresPerformedSectionText(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_PERFORMED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresPerformedSectionText(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresPerformedSectionText(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PROCEDURES_PERFORMED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresPerformedSection The receiving '<em><b>Procedures Performed Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateProceduresPerformedSectionText(ProceduresPerformedSection proceduresPerformedSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURES_PERFORMED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURES_PERFORMED_SECTION);
			try {
				VALIDATE_PROCEDURES_PERFORMED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_PERFORMED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_PERFORMED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresPerformedSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURES_PERFORMED_SECTION__PROCEDURES_PERFORMED_SECTION_TEXT,
						 EmspcrPlugin.INSTANCE.getString("ProceduresPerformedSectionText"),
						 new Object [] { proceduresPerformedSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProceduresPerformedSectionProcedureActivityProcedure1(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Procedure Activity Procedure1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresPerformedSectionProcedureActivityProcedure1(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURES_PERFORMED_SECTION_PROCEDURE_ACTIVITY_PROCEDURE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(emspcr::Procedure))";

	/**
	 * The cached OCL invariant for the '{@link #validateProceduresPerformedSectionProcedureActivityProcedure1(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Performed Section Procedure Activity Procedure1</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProceduresPerformedSectionProcedureActivityProcedure1(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PROCEDURES_PERFORMED_SECTION_PROCEDURE_ACTIVITY_PROCEDURE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresPerformedSection The receiving '<em><b>Procedures Performed Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateProceduresPerformedSectionProcedureActivityProcedure1(ProceduresPerformedSection proceduresPerformedSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURES_PERFORMED_SECTION_PROCEDURE_ACTIVITY_PROCEDURE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURES_PERFORMED_SECTION);
			try {
				VALIDATE_PROCEDURES_PERFORMED_SECTION_PROCEDURE_ACTIVITY_PROCEDURE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURES_PERFORMED_SECTION_PROCEDURE_ACTIVITY_PROCEDURE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURES_PERFORMED_SECTION_PROCEDURE_ACTIVITY_PROCEDURE1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresPerformedSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURES_PERFORMED_SECTION__PROCEDURES_PERFORMED_SECTION_PROCEDURE_ACTIVITY_PROCEDURE1,
						 EmspcrPlugin.INSTANCE.getString("ProceduresPerformedSectionProcedureActivityProcedure1"),
						 new Object [] { proceduresPerformedSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureActivityProcedure1s(ProceduresPerformedSection) <em>Get Procedure Activity Procedure1s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityProcedure1s(ProceduresPerformedSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ACTIVITY_PROCEDURE1S__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(emspcr::Procedure)).oclAsType(emspcr::Procedure)";

	/**
	 * The cached OCL query for the '{@link #getProcedureActivityProcedure1s(ProceduresPerformedSection) <em>Get Procedure Activity Procedure1s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityProcedure1s(ProceduresPerformedSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ACTIVITY_PROCEDURE1S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Procedure> getProcedureActivityProcedure1s(ProceduresPerformedSection proceduresPerformedSection) {
		if (GET_PROCEDURE_ACTIVITY_PROCEDURE1S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EmspcrPackage.Literals.PROCEDURES_PERFORMED_SECTION, EmspcrPackage.Literals.PROCEDURES_PERFORMED_SECTION.getEAllOperations().get(65));
			try {
				GET_PROCEDURE_ACTIVITY_PROCEDURE1S__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ACTIVITY_PROCEDURE1S__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ACTIVITY_PROCEDURE1S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Procedure> result = (Collection<Procedure>) query.evaluate(proceduresPerformedSection);
		return new BasicEList.UnmodifiableEList<Procedure>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedureDescriptionSectionTemplateId(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Description Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureDescriptionSectionTemplateId(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.21')";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedureDescriptionSectionTemplateId(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Description Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedureDescriptionSectionTemplateId(ProceduresPerformedSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PROCEDURE_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param proceduresPerformedSection The receiving '<em><b>Procedures Performed Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateProcedureDescriptionSectionTemplateId(ProceduresPerformedSection proceduresPerformedSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PROCEDURE_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROCEDURES_PERFORMED_SECTION);
			try {
				VALIDATE_PROCEDURE_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(proceduresPerformedSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROCEDURES_PERFORMED_SECTION__PROCEDURE_DESCRIPTION_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProcedureDescriptionSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(proceduresPerformedSection, context) }),
						 new Object [] { proceduresPerformedSection }));
			}
			 
			return false;
		}
		return true;
	}

} // ProceduresPerformedSectionOperations