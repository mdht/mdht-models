/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_INT;
import org.eclipse.mdht.uml.hl7.datatypes.operations.IVL_INTOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>IVL INT</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT#validateOptionsContainingLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT#validateOptionsContainingCenter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Center</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT#validateOptionsContainingHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT#validateOptionsContainingWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT#validateINT(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate INT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class IVL_INTTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOptionsContainingLow() {
		OperationsTestCase<IVL_INT> validateOptionsContainingLowTestCase = new OperationsTestCase<IVL_INT>(
			"validateOptionsContainingLow",
			operationsForOCL.getOCLValue("VALIDATE_OPTIONS_CONTAINING_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_INT target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_INT());

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_INT target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setWidth(DatatypesFactory.eINSTANCE.createINT());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_INT target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_INT());

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_INT target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_INT());

						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setWidth(DatatypesFactory.eINSTANCE.createINT());
					}
				});

			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_INT target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_INT());

						target.setWidth(DatatypesFactory.eINSTANCE.createINT());

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_INT target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_INT());

						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_INT());

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IVL_INTOperations.validateOptionsContainingLow((IVL_INT) objectToTest, diagnostician, map);
			}

		};

		validateOptionsContainingLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOptionsContainingCenter() {
		OperationsTestCase<IVL_INT> validateOptionsContainingCenterTestCase = new OperationsTestCase<IVL_INT>(
			"validateOptionsContainingCenter",
			operationsForOCL.getOCLValue("VALIDATE_OPTIONS_CONTAINING_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_INT target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_INT());

						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_INT());

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_INT target) {

						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_INT());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_INT target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_INT());
					}
				});

			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_INT target) {
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_INT());

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_INT target) {
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setWidth(DatatypesFactory.eINSTANCE.createINT());

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IVL_INTOperations.validateOptionsContainingCenter((IVL_INT) objectToTest, diagnostician, map);
			}

		};

		validateOptionsContainingCenterTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOptionsContainingHigh() {
		OperationsTestCase<IVL_INT> validateOptionsContainingHighTestCase = new OperationsTestCase<IVL_INT>(
			"validateOptionsContainingHigh",
			operationsForOCL.getOCLValue("VALIDATE_OPTIONS_CONTAINING_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addFailTests()
			 *
			 * not self.high.oclIsUndefined() implies
			 * (self.low.oclIsUndefined() and self.center.oclIsUndefined() and self.width.oclIsUndefined()) or
			 * ((not self.low.oclIsUndefined()) and self.width.oclIsUndefined() and self.center.oclIsUndefined()) or
			 * ((not self.width.oclIsUndefined()) and self.low.oclIsUndefined() and self.center.oclIsUndefined())
			 *
			 *
			 * Fail States
			 * high and
			 * l c w
			 * X X X
			 * X X -
			 * X - X
			 * - X X
			 * - X -
			 *
			 * Pass States
			 * high and
			 * l c w
			 * - - -
			 * x - -
			 * - -x
			 */
			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_INT target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setWidth(DatatypesFactory.eINSTANCE.createINT());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_INT target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_INT());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_INT target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setWidth(DatatypesFactory.eINSTANCE.createINT());

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_INT target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setWidth(DatatypesFactory.eINSTANCE.createINT());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_INT());

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_INT target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_INT());

						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_INT());

					}
				});
			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_INT target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_INT());

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_INT target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_INT());

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_INT target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setWidth(DatatypesFactory.eINSTANCE.createINT());

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IVL_INTOperations.validateOptionsContainingHigh((IVL_INT) objectToTest, diagnostician, map);
			}

		};

		validateOptionsContainingHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOptionsContainingWidth() {
		OperationsTestCase<IVL_INT> validateOptionsContainingWidthTestCase = new OperationsTestCase<IVL_INT>(
			"validateOptionsContainingWidth",
			operationsForOCL.getOCLValue("VALIDATE_OPTIONS_CONTAINING_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {
				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_INT target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createINT());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_INT());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_INT target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createINT());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_INT());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_INT target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createINT());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_INT());
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_INT());
					}
				});
			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_INT target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createINT());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_INT());
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_INT target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createINT());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_INT());
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_INT target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createINT());
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_INT());
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IVL_INTOperations.validateOptionsContainingWidth((IVL_INT) objectToTest, diagnostician, map);
			}

		};

		validateOptionsContainingWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateINT() {
		OperationsTestCase<IVL_INT> validateINTTestCase = new OperationsTestCase<IVL_INT>(
			"validateINT", operationsForOCL.getOCLValue("VALIDATE_INT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
				skipFailsTest();
			}

			@Override
			protected void updateToFail(IVL_INT target) {

			}

			@Override
			protected void updateToPass(IVL_INT target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IVL_INTOperations.validateINT((IVL_INT) objectToTest, diagnostician, map);
			}

		};

		validateINTTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends IVL_INTOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<IVL_INT> {

		public IVL_INT create() {
			return DatatypesFactory.eINSTANCE.createIVL_INT();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends IVL_INTOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/

	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // IVL_INTOperations
