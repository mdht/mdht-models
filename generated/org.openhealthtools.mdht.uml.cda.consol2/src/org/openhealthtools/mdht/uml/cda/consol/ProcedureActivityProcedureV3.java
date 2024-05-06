/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.Procedure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Activity Procedure V3</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProcedureActivityProcedureV3()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProcedureActivityProcedureV3TemplateId ProcedureActivityProcedureV3Id ProcedureActivityProcedureV3Code ProcedureActivityProcedureV3StatusCode ProcedureActivityProcedureV3StatusCodeP ProcedureActivityProcedureV3PriorityCode ProcedureActivityProcedureV3TargetSiteCode ProcedureActivityProcedureV3ClassCode ProcedureActivityProcedureV3MoodCode' templateId.root='2.16.840.1.113883.10.20.22.4.14' templateId.extension='2022-06-01' constraints.validation.dependOn.ProcedureActivityProcedureV3StatusCode='ProcedureActivityProcedureV3StatusCodeP' constraints.validation.warning='ProcedureActivityProcedureV3EffectiveTime ProcedureActivityProcedureV3TargetSiteCodeP' priorityCode.codeSystem='2.16.840.1.113883.5.7' priorityCode.codeSystemName='ActPriority' constraints.validation.info='ProcedureActivityProcedureV3PriorityCodeP ProcedureActivityProcedureV3MethodCode' constraints.validation.dependOn.ProcedureActivityProcedureV3PriorityCode='ProcedureActivityProcedureV3PriorityCodeP' targetSiteCode.codeSystem='2.16.840.1.113883.6.96' targetSiteCode.codeSystemName='SNOMEDCT' constraints.validation.dependOn.ProcedureActivityProcedureV3TargetSiteCode='ProcedureActivityProcedureV3TargetSiteCodeP' classCode='PROC' moodCode='EVN'"
 * @generated
 */
public interface ProcedureActivityProcedureV3 extends Procedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.14\' and id.extension = \'2022-06-01\')'"
	 * @generated
	 */
	boolean validateProcedureActivityProcedureV3TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id-&gt;isEmpty() or self.id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not self.id-&gt;isEmpty())'"
	 * @generated
	 */
	boolean validateProcedureActivityProcedureV3Id(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProcedureActivityProcedureV3Code(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProcedureActivityProcedureV3StatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \nvalue.code = \'completed\' or value.code = \'active\' or value.code = \'aborted\' or value.code = \'cancelled\')'"
	 * @generated
	 */
	boolean validateProcedureActivityProcedureV3StatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProcedureActivityProcedureV3EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProcedureActivityProcedureV3PriorityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.priorityCode.oclIsUndefined() or self.priorityCode.isNullFlavorUndefined()) implies (not self.priorityCode.oclIsUndefined() and self.priorityCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.priorityCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.7\' and (value.code = \'A\' or value.code = \'CR\' or value.code = \'CS\' or value.code = \'CSP\' or value.code = \'CSR\' or value.code = \'EL\' or value.code = \'EM\' or value.code = \'P\' or value.code = \'PRN\' or value.code = \'R\' or value.code = \'RR\' or value.code = \'S\' or value.code = \'T\' or value.code = \'UD\' or value.code = \'UR\'))'"
	 * @generated
	 */
	boolean validateProcedureActivityProcedureV3PriorityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.methodCode-&gt;isEmpty() or self.methodCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode-&gt;isEmpty())'"
	 * @generated
	 */
	boolean validateProcedureActivityProcedureV3MethodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.targetSiteCode-&gt;isEmpty() or self.targetSiteCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode-&gt;isEmpty())'"
	 * @generated
	 */
	boolean validateProcedureActivityProcedureV3TargetSiteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.targetSiteCode-&gt;isEmpty() or self.targetSiteCode-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateProcedureActivityProcedureV3TargetSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\')'"
	 * @generated
	 */
	boolean validateProcedureActivityProcedureV3ClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
	 * @generated
	 */
	boolean validateProcedureActivityProcedureV3MoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityProcedureV3 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityProcedureV3 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProcedureActivityProcedureV3
